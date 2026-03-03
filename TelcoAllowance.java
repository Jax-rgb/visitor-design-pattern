// TelcoAllowance.java (Concrete Visitor for data promo)
public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(Telco telco) {
        return telco.getTelcoName() + " - Data: " + telco.getDataAllowance() +
               "GB @ ₱" + telco.getPromoPrice();
    }
}
