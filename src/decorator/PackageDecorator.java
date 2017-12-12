package decorator;

public abstract class PackageDecorator implements Package{
    protected Package mPackage;

    public PackageDecorator(Package mPackage){
        this.mPackage = mPackage;
    }

    public void createPack(){
        mPackage.createPackage();
    }
}
