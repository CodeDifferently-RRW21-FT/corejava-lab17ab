package lab17.part_a.examples;

public class Example01_ConstructorSample {
    int x = 2;

    public Example01_ConstructorSample() {
        x = 5;
    }

    public static void main(String[] args) {
        Example01_ConstructorSample myClass = new Example01_ConstructorSample();
        System.out.println(myClass.x);
    }
}
