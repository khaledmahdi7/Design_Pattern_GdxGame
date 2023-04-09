package com.gdx.game.entities.player;



public class SimulationStrategie {

    public static void main(String[] args) {

        // Création d'un personnage guerrier
        CharacterRecord warrior = new CharacterRecord(100, 50, 20,  "Warrior");

        // Création d'un personnage mage
        CharacterRecord mage = new CharacterRecord(80, 100, 10,  "Mage");
        // Initialisation de la stratégie d'attaque pour les personnages
        AttackStrategy1 warriorStrategy = new BasicAttack1();
        AttackStrategy1 mageStrategy = new AdvanceStrategy1();

        // Utilisation de la stratégie d'attaque pour les personnages
        System.out.println("Avant l'attaque :");
        System.out.println("Guerrier : " + warrior.getBaseDefense() + " points de vie");
        System.out.println("Mage : " + mage.getBaseDefense()+ " points de vie");

        warrior.attack(mage);
        mage.attack(warrior);

        System.out.println("Après l'attaque :");
        System.out.println("Guerrier : " + warrior.getBaseDefense() + " points de vie");
        System.out.println("Mage : " + mage.getBaseDefense()+ " points de vie");

    }
}
