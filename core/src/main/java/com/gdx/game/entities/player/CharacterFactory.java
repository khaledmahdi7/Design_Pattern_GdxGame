package com.gdx.game.entities.player;

public abstract class CharacterFactory {
//afficher le personnage
    //afficher ses stats hp etc et inventaire

public Unit LoadUnit(TypeCharacter type){
   Unit unit = this.createUnit(type);
   unit.LoadInventory();
   return unit;
};

public abstract Unit createUnit(TypeCharacter type);

}