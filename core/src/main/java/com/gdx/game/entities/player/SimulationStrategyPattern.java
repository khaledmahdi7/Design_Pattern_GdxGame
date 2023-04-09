package com.gdx.game.entities.player;


import com.gdx.game.entities.player.AdvancedAttack;
import com.gdx.game.entities.player.BasicAttack;
import com.gdx.game.entities.player.Character;

public class SimulationStrategyPattern {

    public static void main(String[] args) {

        JournalisationSingleton log = JournalisationSingleton.getInstance();

        log.journaliser("begin Character Attack testing simulation");


        // Création des personnages et choix de leur stratégie d'attaque
        Character player1 = new Character("Joueur 1", new BasicAttack());
        Character player2 = new Character("Joueur 2", new AdvancedAttack());

        // Boucle de combat
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            // Le joueur 1 attaque le joueur 2
            player1.attack(player2);
            // Le joueur 2 attaque le joueur 1
            player2.attack(player1);
        }

        // Affichage du gagnant ou match nul
        if (player1.getHealth() > 0) {
            System.out.println(player1.getName() + " a gagné !");
        } else if (player2.getHealth() > 0) {
            System.out.println(player2.getName() + " a gagné !");
        } else {
            System.out.println("Match nul !");
        }

        System.out.println(JournalisationSingleton.getInstance().terminerJournal());


    }
}
