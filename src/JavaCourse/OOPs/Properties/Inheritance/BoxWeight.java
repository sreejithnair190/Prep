package JavaCourse.OOPs.Properties.Inheritance;

public class BoxWeight extends Box{
    int weight;

    BoxWeight(int height, int width, int length, int weight){
        super(height, width, length);
        this.weight = weight;
    }

    public String information() {
        return "BoxWeight{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }

}
