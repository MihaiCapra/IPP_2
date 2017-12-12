package facade;

class Main {
    public static void main(String[] args){
        PackageCreator mPackageCreator = new PackageCreator();

        mPackageCreator.createLetter();
        mPackageCreator.createLetter();
        mPackageCreator.createPackset();
        mPackageCreator.createWoodBox();
    }
}
