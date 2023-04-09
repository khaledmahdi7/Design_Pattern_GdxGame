package com.gdx.game.entities.npc;

import com.gdx.game.entities.player.Unit;

import java.util.ArrayList;

public class TOWNFOLKS extends Unit {

    public static final String TOWN_FOLK_CONFIG = "scripts/town_folk.json";

    public TOWNFOLKS(){
        this.Name="TOWNFOLK";
        this.Unit_ATTACK_POINTS=0;
        this.Unit_DEFENSE_POINTS=0;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= TOWN_FOLK_CONFIG;
    }

    @Override
    public String GetUnitGraphicsConfig() {
        return TOWN_FOLK_CONFIG;
    }

    @Override
    public void LoadInventory() {

    }
}
