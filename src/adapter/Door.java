package adapter;

public class Door implements Package {

    private Package mPackage;

    public Door(){
    }

    Door(Package aPackage){
        this.mPackage = aPackage;
    }

    public void setPackager(Package aPackage){
        this.mPackage = aPackage;
    }

    @Override
    public void dropPackage() {
        mPackage.dropPackage();
    }
}
