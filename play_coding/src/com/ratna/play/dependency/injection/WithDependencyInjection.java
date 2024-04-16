package com.ratna.play.dependency.injection;

import com.ratna.play.model.Item;

import java.math.BigDecimal;

public class WithDependencyInjection {
    private Item item;

    public WithDependencyInjection(Item item) {
       this.item = item;
    }
}
