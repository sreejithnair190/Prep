package JavaCourse.OOPs.Properties.Inheritance;

public class Box {

    int height;
    int width;
    int length;

    Box(){
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    Box(int side){
        this.height = side;
        this.width = side;
        this.length = side;
    }

    Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    Box(Box box){
        this.height = box.height;
        this.width = box.width;
        this.length = box.length;
    }

    public String information() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
