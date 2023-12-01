package JavaCourse.OOPs.InterfacesExamples;

public class CarMedia implements Media{
    @Override
    public void start() {
        System.out.println("Media started");
    }

    @Override
    public void stop() {
        System.out.println("Media Stopped");
    }
}
