package bridge;

public class ReferralLetter implements PackAPI {
    @Override
    public void createCoverLetter(int numberOfStamps) {
        System.out.println(String.format("[TYPE: %s][STAMPS: %d]",
                getClass().getSimpleName(), numberOfStamps));
    }
}
