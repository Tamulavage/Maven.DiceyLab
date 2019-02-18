public class Simulation {

    Bins bin = new Bins();


    public  Simulation(Integer dice, Integer tosses){
        runSimulation(dice,tosses);
        printSimulation(dice,tosses);

    }

    public void runSimulation(Integer dice, Integer tosses)
    {
        Dice die = new Dice(dice);
        //Bin bin = new Bin();
        Integer sum = 0;

        for(int i = 0; i<tosses; i++) {
           sum = die.tossAndSum();
           bin.addCountToSum(sum);
        }

    }

    public void printSimulation(Integer dice, Integer tosses)
    {
        System.out.println("***");
        System.out.println("Simualtion of " + dice + " for " + tosses + " times.");
        System.out.println("***");
        bin.printSim();
    }



    public static void main(String args[]) {
        Simulation sim = new Simulation(2,100000);
    }


}
