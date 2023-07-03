import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

public class IsPositiveTest {
    @Test
    public void checkIsPositiveTrue(){
      IsPositive number = new IsPositive();
      boolean result = number.isPositive(3.5);
      Assertions.assertTrue(result);}


    @Test
    public void checkIsPositiveFalse(){
            IsPositive number = new IsPositive();
            boolean result = number.isPositive(3.5);
            Assertions.assertFalse(result,"ai belit ");
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.5,-4.6,8.9,-8.8,6.5,4.4,Double.MAX_VALUE})
    public void checkIsPositiveParametrized(double numberFromValue){
       IsPositive numberToCheck = new IsPositive();
       boolean resut = numberToCheck.isPositive(numberFromValue);
       Assertions.assertTrue(resut,"ce betesug facem");
    }
}
