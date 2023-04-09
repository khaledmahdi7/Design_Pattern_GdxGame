package com.gdx.game.entities.player;

public class PlayableCharacterFactory extends CharacterFactory{

    @Override
    public Unit createUnit(TypeCharacter type) {
        Unit unit=null;
        switch (type){
            case CLERIC:unit=new CLERIC();break;
            case MAGE:unit=new MAGE();break;
            case WARRIOR:unit=new WARRIOR();break;
            case THIEF:unit=new THIEF();break;
            case GRAPPLER:unit=new GRAPPLER();break;
        }
        return unit;
    }
}
