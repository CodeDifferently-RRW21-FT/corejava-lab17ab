package lab17.part_a.examples;

public class Example03_OverloadingMethod {
    public static void main(String[] args) {
        int myInt = addTwoNumbersMethod(1,5);
       double myDbl = addTwoNumbersMethod(3.1,2.5);
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDbl);
    }
    static int addTwoNumbersMethod(int a, int b){
        return a + b;
    }
    static double addTwoNumbersMethod(double a, double b) {
        return a + b;
    }
}