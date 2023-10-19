package OOPs.InterfacesExamples;

public class Car implements Brake{

    Engine engine;
    Media carMedia = new CarMedia();

    Car(){
        this.engine = new PowerEngine();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void startEngine(){
        this.engine.start();
    }

    public void stopEngine(){
        this.engine.stop();
    }

    public void accEngine(){
        this.engine.acc();
    }

    public void startMusic(){
        this.carMedia.start();
    }

    public void stopMusic(){
        this.carMedia.stop();
    }

    @Override
    public void brake() {
        System.out.println("Brake");
    }
}
