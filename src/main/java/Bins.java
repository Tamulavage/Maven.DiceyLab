import com.sun.javafx.binding.StringFormatter;

import java.sql.SQLOutput;
import java.util.*;

public class Bins {

    SortedMap<Integer, Integer> binMap = new TreeMap();
    Set set = binMap.entrySet();
    Integer overAllCount = 0;

    public void addCountToSum(Integer sumVal) {

        int initalSum = 0;
        // get initial to increase by 1
        if(binMap.containsKey(sumVal)){
             initalSum = binMap.get(sumVal);
            }
        initalSum++;
        this.overAllCount++;

        binMap.put(sumVal, initalSum);


    }


    public Integer getSum(Integer sumVal) {


        return binMap.get(sumVal);
    }


    public void printSim() {

        Float percentage ;

        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            int temp = (Integer) me.getValue();
           percentage =  (float) temp /  overAllCount;
            System.out.println(me.getKey()+ " : " + me.getValue() + " : " +percentage);
        }

    }
}
