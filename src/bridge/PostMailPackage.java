package bridge;

public abstract class PostMailPackage {
    protected PackAPI mPackAPI;

    protected PostMailPackage(PackAPI packAPI){
        this.mPackAPI = packAPI;
    }

    public abstract void Pack();
}
