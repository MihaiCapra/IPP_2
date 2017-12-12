package decorator;

public class Main {
    public static void main(String[] args){
        Package letter = new Letter();
        Package letterWithStamps = new ConcreteDecorator(new Letter());
        Package packsetWithStamps = new ConcreteDecorator(new Packset());

        System.out.println("SIMPLE LETTER");
        letter.createPackage();
        letterWithStamps.createPackage();
        packsetWithStamps.createPackage();
    }
}
