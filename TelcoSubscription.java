// TelcoSubscription.java (the Visitable / Element interface)
public interface TelcoSubscription {
    String getTelcoName();
    int getPromoPrice();           // note: int, not double
    boolean getUnliCallText();
    // accept method - core of visitor pattern
    String accept(UsagePromo promo);
    String accept(UnliCallOffer unli);
}
