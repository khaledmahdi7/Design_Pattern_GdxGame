package com.gdx.game.entities.player;

import java.text.SimpleDateFormat;
import java.util.Date;


public class JournalisationSingleton
{
    private static JournalisationSingleton uniqueInstance ;// Stockage de l'unique instance de cette classe.
    private String log;// Chaine de caractères représentant les messages de log.


    // Constructeur en privé (donc inaccessible à l'extérieur de la classe).
    private JournalisationSingleton()
    {
        log = new String();
    }

    // Méthode statique qui sert de pseudo-constructeur (utilisation du mot clef "synchronized" pour le multithread).
    public  static synchronized JournalisationSingleton getInstance()
    {
        if(uniqueInstance==null){
            uniqueInstance=new JournalisationSingleton();
        }
        return uniqueInstance;
    }

    // Méthode qui permet d'ajouter un message de log.
    public   synchronized  void journaliser(String log)
    {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd hh:mm:sss");
        this.log += "[" + sdf.format(d) + "] " + log + "\n";
    }

    // Méthode qui retourne tous les messages de log.
    public String terminerJournal()
    {
        return log;
    }


}


