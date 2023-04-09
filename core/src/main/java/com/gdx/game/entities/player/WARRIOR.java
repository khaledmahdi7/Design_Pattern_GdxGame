package com.gdx.game.entities.player;

import java.util.ArrayList;

public class WARRIOR extends Unit{

    public static final String WARRIOR_CONFIG = "scripts/player_warrior.json";

    public WARRIOR(){
        this.Name="WARRIOR";
        this.Unit_ATTACK_POINTS=8;
        this.Unit_DEFENSE_POINTS=7;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= WARRIOR_CONFIG;
    }


    @Override
    public String GetUnitGraphicsConfig() {
        return this.WARRIOR_CONFIG;
    }

    @Override
    public void LoadInventory() {
        this.inventory.add("WARRIOR ARMOR");
        this.inventory.add("BOOTS");
        this.inventory.add("WARRIOR SWORD");
        this.inventory.add("HEALING POTION");
        this.inventory.add("HEALING POTION");
    }
}
