import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void tossAndSumTest() {
        // Given
        Dice dice = new Dice(2);
        Integer min  = 2; // 1-1 = 1 : used to simplify if statement
        Integer max = 13; // 12+1= 7 : used to simplify if statement
        Boolean inBetween = false;


        // When
        Integer actualInt =  dice.tossAndSum();
        if(actualInt > min &&  actualInt < max ) {
            inBetween = true;
        }


        // Then
        Assert.assertTrue(inBetween);
    }

     @Test
    public void randomNumbValidTest()
    {
        // Given
        Dice dice = new Dice();
        Integer min  = 0; // 1-1 = 0 : used to simplify if statement
        Integer max = 7; // 6+1= 7 : used to simplify if statement
        Boolean inBetween = false;

        // When
        Integer actualInt = dice.getRandomValue();
        if(actualInt > min &&  actualInt < max ) {
            inBetween = true;
        }

        // Then
        Assert.assertTrue(inBetween);

    }

    @Test
    public void addDieTest(){
        // Given
        Dice dice = new Dice();
        Integer expected = 0;

        // When
        dice.addDie(1);

        // then
        Integer actual = dice.getNumFromDie(1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void assignNumToDieTest(){
        // Given
        Dice dice = new Dice();
        Integer expected = 3;
        dice.addDie(1);

        // WHen
        dice.assignNumToDie(1,3);


        // Then
        Integer actual = dice.getNumFromDie(1);
        Assert.assertEquals(expected, actual);


    }




}
