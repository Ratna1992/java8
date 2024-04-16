package com.ratna.play.dependency.injection;

import com.ratna.play.model.Item;

import java.math.BigDecimal;

public class WithoutDependencyInjection {
    private Item item;

    public WithoutDependencyInjection(Item item) {
        item = new Item("banana",10,new BigDecimal(20));
    }
}
