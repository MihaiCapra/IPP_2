package adapter;

public class BoxAdapter implements Package {
    private PackSet mPackset;

    BoxAdapter(){
        mPackset = new PackSet();
    }

    @Override
    public void dropPackage() {
        mPackset.fitPackage();
    }
}
