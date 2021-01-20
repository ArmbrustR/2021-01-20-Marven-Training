import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppMainTrainingTest {
    @Test
    public void numbersAddedBiggerThan100(){
        //GIVEN
        int num1 = 30;
        int num2 = 60;

        //WHEN
        boolean numbersAddedBiggerThan100true = (num1 + num2) > 100;

        //THEN
        Assertions.assertEquals(false, numbersAddedBiggerThan100true);

    }

    @ParameterizedTest
    @CsvSource({
        "30, 60, false",
        "60, 60, true"
    })

    public void parameterizedtest(int num1, int num2, boolean numbersAddedBiggerThan100){
        Assertions.assertEquals(numbersAddedBiggerThan100, AppMainTraining.numbersMoreThan100(num1, num2));

    }
}
