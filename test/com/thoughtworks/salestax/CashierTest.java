package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void givesZeroWhenNoItemsArePassed() {
        Cashier cashier = new Cashier();

        assertEquals(0, cashier.produceFinalAmount(null), 0.0);
    }

    @Test
    public void givesTheFinalAmountOfFiftyWhenAnItemWhichIsNotTaxableAndNotImportedAndCostsFifty() {
        Item item = new Item("Book", 50, false, false);
        Cashier cashier = new Cashier();

        assertEquals(50, cashier.produceFinalAmount(item), 0.0);

    }
}