package com.gdx.game.inventory;

import com.badlogic.gdx.graphics.Color;
import com.gdx.game.inventory.InventoryItem;

public abstract class InventoryItemDecorator extends InventoryItem {
    //variable d'instance "InventoryItem" pour stocker l'objet décoré
    protected InventoryItem decoratedItem;

    public InventoryItemDecorator(InventoryItem decoratedItem) {
        this.decoratedItem = decoratedItem;
    }
    public abstract String getItemShortDescription();
    public abstract int getItemValue();
   // public abstract Color getColor();


}
