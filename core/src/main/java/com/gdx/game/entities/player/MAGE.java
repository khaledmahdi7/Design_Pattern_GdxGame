package com.gdx.game.entities.player;

import java.util.ArrayList;

public class MAGE extends Unit {

    public static final String MAGE_CONFIG = "scripts/player_mage.json";

    public MAGE(){
        this.Name="MAGE";
        this.Unit_ATTACK_POINTS=8;
        this.Unit_DEFENSE_POINTS=2;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= MAGE_CONFIG;
    }

    @Override
    public String GetUnitGraphicsConfig() {
        return this.MAGE_CONFIG;
    }

    @Override
    public void LoadInventory() {
        this.inventory.add("MAGE ROBES");
        this.inventory.add("BOOTS");
        this.inventory.add("MAGE STAFF");
        this.inventory.add("HEALING POTION");
        this.inventory.add("HEALING POTION");
    }
}
