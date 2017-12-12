package decorator;

public class Letter implements Package {
    @Override
    public void createPackage() {
        System.out.print("\n[LETTER]");
    }
}
