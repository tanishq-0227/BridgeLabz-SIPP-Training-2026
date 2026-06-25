public class Battle {
    public static void startBattle(GameCharacter[] characters) {
        System.out.println("=== BATTLE START ===\n");
        int warriors = 0, mages = 0, archers = 0;

        for (GameCharacter character : characters) {
            character.performAttack();
            
            if (character instanceof Warrior) {
                warriors++;
            } else if (character instanceof Mage) {
                mages++;
            } else if (character instanceof Archer) {
                archers++;
            }
        }

        System.out.println("\n=== BATTLE SUMMARY ===");
        System.out.println("Warriors: " + warriors);
        System.out.println("Mages: " + mages);
        System.out.println("Archers: " + archers);
    }
}
