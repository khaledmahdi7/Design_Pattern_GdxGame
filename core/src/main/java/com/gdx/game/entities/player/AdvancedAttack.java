package com.gdx.game.entities.player;

public class AdvancedAttack implements AttackStrategy {
    public void attack(Character player, Character target){
        int damage = (int)(player.getStrength() * 1.5) - target.getDefense();
        System.out.println(player.getName() + " inflige " + damage + " points de dégâts à " + target.getName() + " avec une attaque avancée");
        target.takeDamage(damage);
    }
}
