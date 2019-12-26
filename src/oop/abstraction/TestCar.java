package oop.abstraction;

public class TestCar {
    public static void main(String[] args) {
        //Car car = new Toyota();
        //Car car = new Car(); // We do not allow to get instance / object from the interface
        // We only allow instance / object from the full class
        Car car = new Toyota();   // Toyota class is a full type class
        car.bodyShape();

        Toyota corolla = new Toyota();
        corolla.start();
        corolla.bodyShape();
        corolla.autoStop();
        //MotorEngine motorEngine = new MotorEngine(); // Error message because MotorEngine is not a complete class
        MotorEngine motorEngine = new Toyota();  // Toyota is a complete class and has all of the features/ methods
        motorEngine.hybridEngine();
        motorEngine.electricEngine();
        motorEngine.engine();




    }
}
