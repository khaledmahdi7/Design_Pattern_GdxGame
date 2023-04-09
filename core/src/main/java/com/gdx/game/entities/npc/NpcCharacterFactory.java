package com.gdx.game.entities.npc;


import com.gdx.game.entities.player.*;
import com.gdx.game.entities.player.TypeCharacter;

public class NpcCharacterFactory extends CharacterFactory {

    @Override
    public Unit createUnit(TypeCharacter type) {
        Unit unit=null;
        switch (type) {
            case ENEMY: unit = new ENEMY();break;
            case NPC: unit = new TOWNFOLKS();break;
        }
        return unit ;
    }
}
