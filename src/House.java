public class House {
    //instance variables
    //at top of class, can be used anywhere but psvm, have public before.
 public int walls;
 public double size;
 public String owner;
 public String address;
 public boolean isOccupied;
 //boolean = true or false
    public void printInfo(){
        System.out.println(walls); //not a readable way ( no quotes)
        System.out.println(size);
        System.out.println("name of owner: "+owner); //readable way (has quotes)
        System.out.println("address: "+ address);
        System.out.println("It is " +isOccupied+ " that the house is occupied"); //fancy readable

    }
    //constructor - no void, same name as class, special method
    public House(){
      walls = 4;
      size = 3200.7;
      owner = "Bobby";
      address = "362 center st.";
      isOccupied = true;

    }
    public House(double pSize, int pWalls, String pOwner){
        size = pSize;
        walls = pWalls;
        owner = pOwner;
    }
}
//add 2 more parameters to house constructor
//set instance variables' value to the parameters
//1 is for occupied and 1 for address and then fix related problems by adding them to the code in factory class