package ie.atu;

public class Main {
    public static void main(String[] args){
        Person johnDoe = new Person("John","Doe",20);
        Person Blank = new Person();


        johnDoe.displayInfo();
        Blank.displayInfo();
    }
}
