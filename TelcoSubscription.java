public interface TelcoSubscription {
    double accept(UsagePromo promo, int price);
    String accept(UnliCallOffer unli, boolean hasUnli);

    String getTelcoName();
    int getPromoPrice();
    int getDataAllowance();
    boolean getUnliCallText();
}
