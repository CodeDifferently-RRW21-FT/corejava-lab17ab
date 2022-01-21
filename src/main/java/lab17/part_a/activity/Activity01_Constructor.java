package lab17.part_a.activity;

public class Activity01_Constructor {
    private String name;

    Activity01_Constructor() {
        System.out.println("The constructor is being called:");
        name = "Francis";
    }

    public static void main(String[] args) {
        Activity01_Constructor object = new Activity01_Constructor();
        System.out.println("The name is " + object.name);
    }
}
