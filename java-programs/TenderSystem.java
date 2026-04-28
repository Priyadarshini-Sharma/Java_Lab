public class TenderSystem {

    static class Tender {
        String companyName;
        double cost;

        Tender(String companyName, double cost) {
            this.companyName = companyName;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Tender[] tenders = {
            new Tender("ABC Constructions",  150000),
            new Tender("XYZ Builders",       120000),
            new Tender("PQR Infrastructure", 175000),
            new Tender("LMN Projects",        98000),
            new Tender("DEF Contractors",    135000)
        };

        System.out.println("All Tenders:");
        System.out.println("-----------------------------------");
        System.out.printf("%-25s %-10s%n", "Company", "Cost");
        System.out.println("-----------------------------------");

        Tender lowest = tenders[0];
        for (Tender t : tenders) {
            System.out.printf("%-25s %-10.2f%n", t.companyName, t.cost);
            if (t.cost < lowest.cost)
                lowest = t;
        }

        System.out.println("-----------------------------------");
        System.out.println("Company with Minimum Cost: " + lowest.companyName);
        System.out.println("Cost: " + lowest.cost);
    }
}