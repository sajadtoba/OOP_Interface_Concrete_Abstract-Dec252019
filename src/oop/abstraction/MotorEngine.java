package oop.abstraction;

public abstract class MotorEngine implements Motor {
    // Declare Method
    //AccessModifier TypeOfMethod NameOfTheMethod Open&Close Prenthese Ope&close Curly brackets
    public void hybridEngine() {
        System.out.println("Fuel efficient");
    }
    // this is called declare and implement the method. From Line 6 to Line 7.

    public abstract void electricEngine();   // This is called only Declare the Method line 10

    // When we have abstract Method then we can not implement it.

// After we use this class extends with another class then we need to implement the Declared Method Line 10
// Now we can implements the new Interface class(Motor) in this class or in the Concrete (Toyota) otherwise
    // error message in the Concrete Class (Toyota will not go away)
    public void engine(){
        System.out.println("motor is running by an engine gasoline engine");
    }


}