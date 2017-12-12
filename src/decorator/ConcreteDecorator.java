package decorator;

public class ConcreteDecorator extends PackageDecorator {

    public ConcreteDecorator(Package mPackage){
        super(mPackage);
    }

    @Override
    public void createPackage() {
        mPackage.createPackage();
        addStamps(mPackage);
    }

    private void addStamps(Package mPackage){
        System.out.print("[STAMPS][TRUE]");
    }
}
