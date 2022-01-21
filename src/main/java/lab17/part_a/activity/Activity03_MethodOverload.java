package lab17.part_a.activity;

public class Activity03_MethodOverload {
    public static void main(String[] args) {
        display('a',2);
        display(1, 'y');
    }
    static void display(char c, int num){
        System.out.println("First I print the character " + c + " and then the number "+ num);
    }
    static void display(int num, char c){
        System.out.println("First I print the number " + c + " and then the character "+ num);
    }
}
