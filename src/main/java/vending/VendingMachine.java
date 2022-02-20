package vending;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private int[] coinDenominations;

    public VendingMachine(int[] coinDenominations) {
        this.coinDenominations = coinDenominations;
    }

    public Integer[] CalculateChange(Double price, Double tenderAmount) {
        List<Integer> cents = new ArrayList<>();
        double change = (tenderAmount * 100) - (price * 100);
        for (int i = coinDenominations.length - 1; i >= 0; i--) {
            int coin = coinDenominations[i];
            int coinCount = 0;
            int eg = (int) change / coin;
            for (int j = 0; j < eg; j++) {
                cents.add(coin);
                coinCount += coin;
            }
            change -= coinCount;
        }

        return cents.toArray(Integer[]::new);
    }
}
