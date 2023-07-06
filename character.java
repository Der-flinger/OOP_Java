import java.util.Random;

public abstract class character {
    private String name;
    private int level;
    private int power;
    private int health;
    private int speed;
    private int defense;
    protected static Random r;

    public character(String name, int lvl, int power, int hp, int speed, int defense) {
        this.name = name;
        this.level = lvl;
        this.power = power;
        this.health = hp;
        this.speed = speed;
        this.defense = defense;
    }

    public void attack(character target) {
        target.health -= power * level * 0.5;
    }

    public void getDamage(character currentCharacter)  {
        currentCharacter.health -= power * level * 0.5;
    }

    public void healing(character target) {
        target.health += power * level * 0.5;
    }

    public void getTreatment(character currentCharacter) {
        currentCharacter.health += power * level * 0.5;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Name: %s lvl: %d HP: %d ", name, level, health);
    }
}
