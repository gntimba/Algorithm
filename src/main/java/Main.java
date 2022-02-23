import vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        var coinDenominationsUK = new int[]{1, 5, 10, 25};
        var coinDenominationUS = new int[]{1,2,5,10,20,50};
        var purchaseAmount = 3.46; // amount the item cost
        var tenderAmount = 4.00; // amount the user input for the purchase
        var change = tenderAmount - purchaseAmount; // amount the user should receive back
        VendingMachine vendingMachine = new VendingMachine(coinDenominationsUK);
        var changeGiven = vendingMachine.CalculateChange(purchaseAmount, tenderAmount);
        for ( Integer changeGivens : changeGiven) {
            System.out.println(changeGivens);

        }
    }
}
