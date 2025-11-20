public class Farm {
    public int numberOfAnimals;
    public String Animal;
    public boolean hasAnimals;

    public Farm(){
        System.out.println(" we make Farms!");
        numberOfAnimals = 5;
        Animal = "Horse";
        hasAnimals = true;

    }
    public void FarmInfo() {
        System.out.println("the farm info: ");
        System.out.println("it is " + hasAnimals + " that the farm has " + numberOfAnimals + " Horses");
        System.out.println("it is " + hasAnimals + " that the farm is open");
    }
        public Farm (int pnumberOfAnimals, String pAnimal, boolean phasAnimals){
        numberOfAnimals = pnumberOfAnimals;
        Animal = pAnimal;
        hasAnimals = phasAnimals;


    }
}
