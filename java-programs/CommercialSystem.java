public class CommercialSystem {

    interface SalesDepartment {
        void processSale(double amount);
    }

    interface FinanceDepartment {
        void generateInvoice(String clientName, double amount);
    }

    static class CommercialExecutive implements SalesDepartment, FinanceDepartment {
        private double totalSales = 0;
        private String lastClient = "";

        @Override
        public void processSale(double amount) {
            totalSales += amount;
            System.out.println("===== Sales Department =====");
            System.out.println("Sale processed successfully!");
            System.out.println("Sale Amount   : Rs. " + amount);
            System.out.println("============================");
        }

        @Override
        public void generateInvoice(String clientName, double amount) {
            lastClient = clientName;
            System.out.println("===== Finance Department =====");
            System.out.println("Invoice Generated!");
            System.out.println("Client Name   : " + clientName);
            System.out.println("Invoice Amount: Rs. " + amount);
            System.out.println("Status        : Payment Pending");
            System.out.println("==============================");
        }

        public void showSummary() {
            System.out.println("===== Commercial Summary =====");
            System.out.println("Total Sales Processed : Rs. " + totalSales);
            System.out.println("Last Invoice Client   : " + lastClient);
            System.out.println("All operations completed successfully.");
            System.out.println("==============================");
        }
    }

    public static void main(String[] args) {
        CommercialExecutive exec = new CommercialExecutive();
        exec.processSale(75000);
        exec.generateInvoice("Tata Consultancy", 75000);
        exec.showSummary();
    }
}
