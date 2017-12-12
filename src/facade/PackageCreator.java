package facade;

class PackageCreator {
    private Letter mLetter;
    private Packset mPackset;
    private WoodBox mWoodBox;

    public PackageCreator(){
        this.mLetter = new Letter();
        this.mPackset = new Packset();
        this.mWoodBox = new WoodBox();
    }

    public void createLetter(){
        mLetter.createPackage();
    }

    public void createPackset(){
        mPackset.createPackage();
    }

    public void createWoodBox(){
        mWoodBox.createPackage();
    }
}
