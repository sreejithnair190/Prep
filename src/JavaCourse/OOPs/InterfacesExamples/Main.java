package JavaCourse.OOPs.InterfacesExamples;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
        car.upgradeEngine();
        car.startEngine();
        car.startMusic();
        car.stopMusic();
        car.brake();
        car.stopEngine();
    }
}
