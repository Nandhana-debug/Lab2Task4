public class Main {
    public static void main(String[] args) {
        double productCost = 9.99;
        double vatRate = 0.05;

        double vatPerUnit = productCost * vatRate;

        double totalNet = 0;
        double totalVat = 0;
        double totalGross = 0;

        for (int i = 1; i <= 10000; i++) {
            totalNet = totalNet + productCost;
            totalVat = totalVat + vatPerUnit;
            totalGross = totalGross + productCost + vatPerUnit;
        }

        System.out.println("Total Net Sales: " + totalNet);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total Gross Sales: " + totalGross);
    }
}