public class Commission {
    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        if (sales <= 5000)
            return sales * 0.05;
        else if (sales <= 10000)
            return sales * 0.10;
        else
            return sales * 0.15;
    }

    public static void main(String[] args) {
        double salesValue = 8000;

        if (salesValue < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission obj = new Commission(salesValue);
            System.out.println("Sales: " + obj.sales);
            System.out.println("Commission: " + obj.commission());
        }
    }
}
