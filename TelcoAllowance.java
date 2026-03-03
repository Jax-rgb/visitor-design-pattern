public class TelcoAllowance implements UsagePromo {

    @Override
    public double computeAllowance(String telcoName, double price) {

        if (telcoName.equals("Smart")) {
            System.out.println("Smart offers 15GB.");
            return price;
        }
        if (telcoName.equals("Globe")) {
            System.out.println("Globe offers 10GB.");
            return price;
        }
        if (telcoName.equals("Ditto")) {
            System.out.println("Ditto offers 8GB.");
            return price;
        }

        return 0;
    }

    public String showAllowance(String telcoName, double price) {
        return computeAllowance(telcoName, price) + " pesos";
    }
}
