package com.gdx.game.entities.player;

public class Character {


    private String name;
    private int strength;
    private int dexterity;
    private int defense;
    private int health;
    private AttackStrategy attackStrategy;

    public Character(String name,
                     AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
// Initialiser les attributs de la slasse
        this.strength = 10;
        this.dexterity = 10;
        this.defense = 5;
        this.health = 100;
    }


    public void attack(Character target) {
        attackStrategy.attack(this, target);
    }
    public void takeDamage (int damage) {
        this.health -= damage;
        System.out.println(this.name + " a maintenant " + this.health + " points de vie");
    }

    public String getName() {
        return name;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getDefense() {

        return defense;
    }

    public int getStrength() {
        return strength;
    }
    public int getHealth(){
        return health;
    }
}




