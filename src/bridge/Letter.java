package bridge;

public class Letter extends PostMailPackage {
    private int mNumberOfStamps;
    public Letter(int numberOfStamps, PackAPI packAPI){
        super(packAPI);
        this.mNumberOfStamps = numberOfStamps;
    }

    @Override
    public void Pack() {
        mPackAPI.createCoverLetter(mNumberOfStamps);
    }
}
