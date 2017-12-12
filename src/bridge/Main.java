package bridge;

public class Main {
    public static void main(String[] args){
        Letter mReferralLetter = new Letter(4, new ReferralLetter());
        Letter mLetterOfInterest = new Letter(2, new LetterOfInterest());

        mReferralLetter.Pack();
        mLetterOfInterest.Pack();
    }
}
