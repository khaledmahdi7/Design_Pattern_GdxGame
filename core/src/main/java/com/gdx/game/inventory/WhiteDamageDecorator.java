package com.gdx.game.inventory;

import com.badlogic.gdx.graphics.Color;

public class WhiteDamageDecorator extends InventoryItemDecorator {
    public WhiteDamageDecorator(InventoryItem decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int getItemValue() {
        //si le joueur utilise la couleur blanche, alors il va faire perdre a son ennemie +5 pt de damage par rapport a lancienne
        return decoratedItem.getItemValue() + 5;
    }

    @Override
    public String getItemShortDescription() {
        return  decoratedItem.getItemShortDescription() +  "blanche";
    }
}
