public class Telco implements TelcoSubscription {

    private int dataAllowance;
    private int promoPrice;
    private String telcoName;
    private boolean unliCallText;

    public Telco(int dataAllowance, int promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public double accept(UsagePromo promo, int price) {
        return promo.computeAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer unli, boolean hasUnli) {
        return unli.computeUnli(telcoName, hasUnli);
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public int getPromoPrice() {
        return promoPrice;
    }

    @Override
    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }
}
