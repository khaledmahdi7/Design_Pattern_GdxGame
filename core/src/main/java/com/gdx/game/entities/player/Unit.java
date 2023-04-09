package com.gdx.game.entities.player;

import com.gdx.game.entities.EntityConfig;

import java.util.ArrayList;

public abstract class Unit {
    protected  String Name;
    protected  int Unit_ATTACK_POINTS;
    protected  int Unit_DEFENSE_POINTS;
    protected ArrayList<String> inventory ;
    protected String CHARACTER_CONFIG;

    public abstract String GetUnitGraphicsConfig();

    public abstract void LoadInventory();

    public int getUnit_ATTACK_POINTS(){return Unit_ATTACK_POINTS ;}
    public int getUnit_DEFENSE_POINTS(){return Unit_DEFENSE_POINTS ;}
    public String getNAME(){return Name ;}
    public ArrayList<String> getInventory(){return inventory;}

    public String toString(){
        String str = "Nom : "+this.Name+"\n";
        str+= "Points d Attaques : "+this.Unit_ATTACK_POINTS+"\n";
        str+="Points de defense : "+this.Unit_DEFENSE_POINTS+"\n";
        str+="Equipements de base : "+this.inventory+"\n";
        for (int i=0; i<this.inventory.size(); i++){
            str+=inventory.get(i)+" ";
        }
        return  str;
    }

}
