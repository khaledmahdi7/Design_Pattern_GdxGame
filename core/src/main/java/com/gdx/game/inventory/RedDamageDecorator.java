package com.gdx.game.inventory;

import com.badlogic.gdx.graphics.Color;

public class RedDamageDecorator extends InventoryItemDecorator {
    public RedDamageDecorator(InventoryItem decoratedItem) {
        super(decoratedItem);
    }


    @Override
    public int getItemValue() {
        return decoratedItem.getItemValue() + 50;
    }

    @Override
    public String getItemShortDescription() {
        return decoratedItem.getItemShortDescription() + "rouge";
    }
}

