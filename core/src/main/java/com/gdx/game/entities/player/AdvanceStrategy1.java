package com.gdx.game.entities.player;

public class AdvanceStrategy1 implements AttackStrategy1 {

    @Override
    public void attack(CharacterRecord attacker, CharacterRecord target,CharacterRecord attackerRecord) {
        int damage = calculateDamage(attackerRecord.getBaseAttack() + 20, target.getBaseDefense());
        target.takeDamage(damage);
    }

    @Override
    public int attack(CharacterRecord target, int baseAttack) {
        return calculateDamage(baseAttack + 20, target.getBaseDefense());
    }

    private int calculateDamage(int attack, int defense) {
        int damage = attack - defense;
        return Math.max(10, damage);
    }
}

