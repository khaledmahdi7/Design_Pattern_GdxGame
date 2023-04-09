package com.gdx.game.entities.player;

import com.gdx.game.entities.npc.NpcCharacterFactory;

public class SimulatorCharacterCreation {
    public static void  main(String[]args) {
        CharacterFactory PlayableCharacterFactory = new PlayableCharacterFactory();
        Unit CLERIC = PlayableCharacterFactory.LoadUnit(TypeCharacter.CLERIC);
        Unit GRAPPLER = PlayableCharacterFactory.LoadUnit(TypeCharacter.GRAPPLER);

        CharacterFactory NpcCharacterFactory= new NpcCharacterFactory();
        Unit Enemy= NpcCharacterFactory.LoadUnit(TypeCharacter.ENEMY);
        Unit NPC= NpcCharacterFactory.LoadUnit(TypeCharacter.NPC);

        System.out.println("********************");
        System.out.println("ENEMY specifics:");
        System.out.println(Enemy);
        System.out.println("********************");
        System.out.println("NPC specifics:");
        System.out.println(NPC);

        System.out.println("********************");
        System.out.println("Cleric :");
        System.out.println("graphics configuration file path :");
        System.out.println(CLERIC.GetUnitGraphicsConfig());
        System.out.println("Cleric attack points");
        System.out.println(CLERIC.getUnit_ATTACK_POINTS());
        System.out.println(CLERIC.getInventory());
        System.out.println("********************");
        System.out.println("CHARACTER SUMMARY :");
        System.out.println(CLERIC);
        System.out.println("********************");
        System.out.println("GRAPPLER ");
        System.out.println(GRAPPLER);
    }
}
