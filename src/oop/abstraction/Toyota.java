package oop.abstraction;
//public abstract class Toyota implements Car {
//public abstract class Toyota implements Car {
//public class Toyota extends MotorEngine implements Car {
    public class Toyota extends MotorEngine implements Car {

    public void bodyShape() {
        System.out.println("Car must be below 6 feet");
    }
    public void start() {
        System.out.println("must have engine run by gasoline");

    }
    public void stop() {
        System.out.println("must stop the time it needed");

    }
    public void autoStop(){
        System.out.println("The car must auto stop");
    }

    //@Override
   // public void electricEngine() {

    //}

    //public abstract void flyingCar(); // to fix the error message we must abstract the Class name
    // Line 4 giving the Error Message because we need to implements the Declared Methods in the Abstract Class MotorEngines
    // How we can implements Line 22 to Line 24
    public void electricEngine(){
        System.out.println("Lets implement Lithium ion battery to build electric car");
    }
}
