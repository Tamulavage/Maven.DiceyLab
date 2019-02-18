import org.omg.CORBA.INTERNAL;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Dice {
    SortedMap<Integer, Integer> diceValue = new TreeMap();
    Set set = diceValue.entrySet();

    // default constructor
    public Dice(){
    }

    public Dice(Integer countOfDice){
       for(int i=1; i<=countOfDice; i++) {
           addDie(i);
       }
   }




    public Integer getRandomValue() {



        Integer retVal = (int)(Math.random()*6)+1;
  //      System.out.println(retVal);

        return retVal;
    }

    public void addDie(Integer dieCount) {
        diceValue.put(dieCount, 0);

    }


    public void assignNumToDie(Integer dieKey, Integer dieValue) {
        diceValue.put(dieKey,dieValue);

    }

    public Integer getNumFromDie(Integer dieKey) {
        //System.out.println(diceValue.get(dieKey));
        return diceValue.get(dieKey);
    }

    public Integer tossAndSum() {
        int randmonNum = 0;
        Integer sum = 0;

        for(SortedMap.Entry<Integer, Integer> entry: diceValue.entrySet()){
            randmonNum = getRandomValue();
            entry.setValue(randmonNum);
            sum = sum + randmonNum;
        }

        return sum;


    }
}
