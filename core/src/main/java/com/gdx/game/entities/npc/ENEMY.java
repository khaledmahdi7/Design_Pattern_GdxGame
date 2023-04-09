package com.gdx.game.entities.npc;

import com.gdx.game.entities.player.Unit;

import java.util.ArrayList;

public class ENEMY extends Unit {

    public static final String ENEMY_CONFIG = "scripts/enemies.json";


    public ENEMY(){
        this.Name="ENEMY BOSS";
        this.Unit_ATTACK_POINTS=8;
        this.Unit_DEFENSE_POINTS=8;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= ENEMY_CONFIG;
    }


    @Override
    public String GetUnitGraphicsConfig() {
        return ENEMY_CONFIG;
    }

    // l'ennemi n'as pas besoin de méthode load inventaire
    @Override
    public void LoadInventory() {

    }
}
