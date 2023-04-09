package com.gdx.game.inventory;

import com.badlogic.gdx.graphics.Color;
//si le sldat joue avec la couleur bleu, alors le dommage povoque est de -30
public class BlueDamageDecorator extends InventoryItemDecorator {
    public BlueDamageDecorator(InventoryItem decoratedItem) {
        super(decoratedItem);
    }



    @Override
    //augmenter le damage de 30 si le joueur utiilise la couleur bleu
    public int getItemValue() {
        return decoratedItem.getItemValue() + 30;
    }

    @Override
    public String getItemShortDescription() {
        return  decoratedItem.getItemShortDescription() + "Bleu" ;
    }
}

