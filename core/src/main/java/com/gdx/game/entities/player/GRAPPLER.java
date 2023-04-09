package com.gdx.game.entities.player;

import java.util.ArrayList;

public class GRAPPLER extends Unit{

    public static final String GRAPPLER_CONFIG = "scripts/player_grappler.json";


    public GRAPPLER(){
        this.Name="CLERIC";
        this.Unit_ATTACK_POINTS=5;
        this.Unit_DEFENSE_POINTS=5;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= GRAPPLER_CONFIG;
    }

    @Override
    public String GetUnitGraphicsConfig() {
        return this.GRAPPLER_CONFIG;
    }

    @Override
    public void LoadInventory(){
        this.inventory.add("GRAPPLER ARMOR");
        this.inventory.add("BOOTS");
        this.inventory.add("BRASS KNUCKLES");
        this.inventory.add("HEALING POTION");
    }
}
