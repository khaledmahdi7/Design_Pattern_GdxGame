package com.gdx.game.inventory;

public class InventoryItemRightArm extends InventoryItem {
    @Override
    public String getItemShortDescription() {
        return "Si l'arme place dans la main droite est: ";
    }

    @Override
    //en utilisant l'arme de droite le soldat fais perdre a son ennemi 10 oint de vie
    public int getItemValue() {
        return 20;
    }
}