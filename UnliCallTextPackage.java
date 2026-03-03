public class UnliCallTextPackage implements UnliCallOffer {

    @Override
    public String computeUnli(String telcoName, boolean unli) {

        if (!unli)
            return "No unlimited calls/text";

        switch (telcoName) {
            case "Smart":
                return "No unlimited calls/text (charged per use)";
            case "Globe":
                return "Unlimited calls/text within Globe network";
            case "Ditto":
                return "Unlimited calls/text to ALL networks";
        }

        return "Unknown";
    }

    public String showUnliCallsTextOffer(String telcoName, boolean unli) {
        return computeUnli(telcoName, unli);
    }
}
