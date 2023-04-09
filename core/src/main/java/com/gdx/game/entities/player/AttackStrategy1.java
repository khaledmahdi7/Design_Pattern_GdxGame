package com.gdx.game.entities.player;



public interface AttackStrategy1 {
    void attack(CharacterRecord attacker,CharacterRecord target,CharacterRecord attackerRecord);


    int attack(CharacterRecord target, int baseAttack);
}
