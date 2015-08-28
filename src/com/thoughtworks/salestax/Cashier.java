package com.thoughtworks.salestax;


public class Cashier {
    private Item item;

    public double produceFinalAmount(Item item) {
        if(item==null)
            return 0;
        else
            return item.netAmount();
    }
}
