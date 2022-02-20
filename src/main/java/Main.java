import vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        var coinDenominations = new int[]{1, 5, 10, 25};
        var purchaseAmount = 1.35; // amount the item cost
        var tenderAmount = 2.00; // amount the user input for the purchase
        var change = tenderAmount - purchaseAmount; // amount the user should receive back
        VendingMachine vendingMachine = new VendingMachine(coinDenominations);
        var changeGiven = vendingMachine.CalculateChange(purchaseAmount, tenderAmount);
        for ( Integer changeGivens : changeGiven) {
            System.out.println(changeGivens);

        }
    }
}
