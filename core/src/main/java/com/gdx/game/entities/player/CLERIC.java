package com.gdx.game.entities.player;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.badlogic.gdx.utils.Json;
import com.gdx.game.entities.EntityConfig;

import java.util.ArrayList;


public class CLERIC extends Unit{

    /** méthode de parse d'un json file pour récuperer une element spécifique d'un json file
     *  qui à était abandonné à cause d'un conflit de library le programme gdx n'a pas reconnu org.json.jsonParse
     *  comme une library valide
     * */
    //JSONParser jsonParser = new JSONParser();
    //JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("core/src/main/resources/scripts/player_cleric.json"));
    //String value1 = (String) jsonObject.get("entityID");
    //ArrayList<String> value2 = (ArrayList<String>) jsonObject.get("inventory");

    public static final String CLERIC_CONFIG = "scripts/player_cleric.json";


    public CLERIC(){
        this.Name="CLERIC";
        this.Unit_ATTACK_POINTS=5;
        this.Unit_DEFENSE_POINTS=5;
        this.inventory=new ArrayList<String>();
        this.CHARACTER_CONFIG= CLERIC_CONFIG;
    }


    @Override
    public String GetUnitGraphicsConfig() {
        return this.CLERIC_CONFIG;
    }

    @Override
    public void LoadInventory() {
        this.inventory.add("ARMOR CLERIC");
        this.inventory.add("BOOTS");
        this.inventory.add("SWORD");
        this.inventory.add("HEALING POTION");
    }
}
