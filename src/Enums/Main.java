package Enums;

public class Main {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        Week week = Week.Thursday;

        for (Week day : Week.values()) {
            System.out.println(day);
        }
    }
}
