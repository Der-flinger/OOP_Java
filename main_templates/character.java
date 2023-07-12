package main_templates;

import java.util.Random;

/**
 * Базовый класс, на котором основаны все другие персонажи
 */
public abstract class character implements charcterInterface {

  protected String name;
  private int level;
  protected int power;
  private int health;
  protected int speed;
  protected int defense;
  protected Random r = new Random();
  protected coordinates position;

  public character(String name, int lvl, int power, int hp, int speed, int defense, int x, int y) {
    this.name = name;
    this.level = lvl;
    this.power = power;
    this.health = hp;
    this.speed = speed;
    this.defense = defense;
    this.position = new coordinates(x, y);
  }

  @Override
  public void getCharInfo() {
    System.out.println(
        String.format(
            "name-> %s  | lvl = %d | hp = %d | type: %s  | position--> %s",
            this.name, this.level, this.health, this.getClass().getSimpleName(), this.position));
  }

  public int getX(character ch) {
    return ch.position.x;
  }

  public int getY(character ch) {
    return ch.position.y;
  }

  public void attack(character target) {
    target.health -= power * level * 0.5;
  }

  public void getDamage(character currentCharacter) {
    currentCharacter.health -= power * level * 0.5;
  }

  public void healing(character target) {
    target.health += power * level * 0.5;
  }

  public void getTreatment(character currentCharacter) {
    currentCharacter.health += power * level * 0.5;
  }
}
