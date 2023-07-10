package characters;

import main_templates.rangeCharacter;

/**
 * Колдун
 */
public class Enchanter extends rangeCharacter {

  // public Enchanter(String name, int lvl, int power, int hp, int speed, int defense, Double accuracy, int range){
  //     super(name, lvl, power, hp, speed, defense, accuracy, range);
  // }

  public Enchanter(String name) {
    super("rangeChar", 5, 8, 65, 1, 4, 0.0, 0);
    this.name = name;
    this.accuracy = 0.9;
    this.range = 10;
  }

  /**
   * Описание действия существа
   */
  @Override
  public void step() {
    System.out.println("Усиливает союзника");
  }
}
