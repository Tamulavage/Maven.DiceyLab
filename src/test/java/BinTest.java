import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    @Test
    public void addCountToSumTest() {


    // Given
    Bins bin = new Bins();
    Integer expected = 1;

    // When
    bin.addCountToSum(1);

    // then
    Integer actual = bin.getSum(1);
    Assert.assertEquals(expected,actual);
}

}
