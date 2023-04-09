package com.gdx.game.entities.player;

import java.util.ArrayList;

public class THIEF extends Unit{

    public static final String THIEF_CONFIG = "scripts/player_thief.json";

    public THIEF(){
        this.Name="WARRIOR";
        this.Unit_ATTACK_POINTS=6;
        this.Unit_DEFENSE_POINTS=9;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= THIEF_CONFIG;
    }

    @Override
    public String GetUnitGraphicsConfig() {
        return this.THIEF_CONFIG;
    }

    @Override
    public void LoadInventory() {
        this.inventory.add("THIEF ARMOR");
        this.inventory.add("BOOTS");
        this.inventory.add("KNIVES");
        this.inventory.add("HEALING POTION");
        this.inventory.add("HEALING POTION");
    }
}
