package com.gdx.game.inventory;

public class InventoryItemLeftArm extends InventoryItem {
    @Override
    public String getItemShortDescription() {
        return "si le bouclier place dans la main gauche est: ";
    }

    @Override
    //en utilisant l'arme de gauche le soldat fais perdre a son ennemi 10 point de vie
    public int getItemValue() {
        return 10;
    }
}