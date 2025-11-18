public class Factory {
    //instance variables
    public int yearFounded;
    public boolean isOpen;
    //double (decimal number)
    public double earnings;
    //string
    public String products;

    public static void main(String[] args) {
        System.out.println("Welcome to Dylan's Factory");
        //have to have new
        //psvm
        new Factory();



    }
        //constructor
        public Factory(){
            System.out.println(" we make houses!"); // we make houses = string
            yearFounded = 2025;
            isOpen = false;
            earnings = 1.1;
            products = "houses";
            factoryInfo();
            yearFounded = 2026;
            factoryInfo();

            //constructing new house
            //h1 = variable (object of type house)
            House h1 = new House();
            h1.owner = "Mr.Kim";
            System.out.println("The owner is " + h1.owner);
            //todo: give all the house instance variables values
            h1.address = "123 Milton Drive";
            System.out.println("The address is " + h1.address);
            h1.walls = 4;
            System.out.println("The amount of walls is " + h1.walls);
            h1.isOccupied = true;
            h1.size = 100;
            House h2 = new House();
            System.out.println(h2.size);
            h2.size = 40.2;
            System.out.println(h2.size);
            h2.printInfo();
           House myHouse = new House();
            myHouse.printInfo();

            House customHouse = new House(200.24,8, "Bobby");
            customHouse.printInfo();

    }
    public void factoryInfo(){
        System.out.println("the factory info: ");
        System.out.println(products);
        System.out.println("the year founded: ");
        System.out.println(yearFounded);
        System.out.println("the earnings: " + earnings);
        System.out.println("it is " + isOpen + " that the factory is open");

    }

}
//constructor diff type of method because it doesnt have a void and matches name of class
//instance variables are made at top of class and have public and they can be used everywhere inside factory instead of psvm
//todo: make method called factory info
//todo: add souts to print the factory's instance variables
//todo: change the yearFounded (value) and isOpen and call factoryInfo()
//todo: make a printInfo method that prints all house instance variables
//todo: make another hosue called myHouse
//todo: call printInfo on myHouse