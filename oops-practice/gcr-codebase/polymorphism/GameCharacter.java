public abstract class GameCharacter {
    protected String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public abstract void performAttack();

    public String getCharacterName() {
        return characterName;
    }
}
