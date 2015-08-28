package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void givesZeroWhenNoItemsArePassed() {
        Cashier cashier = new Cashier();
        
        assertEquals(0,cashier.produceFinalAmount(),0.0);
    }
}