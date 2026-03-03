// UnliCallTextPackage.java (Concrete Visitor for unli package)
public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(Telco telco) {
        String status = telco.getUnliCallText() ? "Yes" : "No";
        return telco.getTelcoName() + " - Unlimited calls and text: " + status;
    }
}
