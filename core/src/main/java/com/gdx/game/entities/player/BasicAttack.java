package com.gdx.game.entities.player;

public class BasicAttack implements AttackStrategy {
    public void attack(Character player, Character target){
        int damage = player.getStrength() - target.getDefense();
        System.out.println(player.getName() + " inflige " + damage + " points de dégâts à " + target.getName());
        target.takeDamage(damage);
    }
}

