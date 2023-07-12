package characters;

import main_templates.rangeCharacter;

/**
 * Колдун
 */
public class Enchanter extends rangeCharacter {

  public Enchanter(String name, int x, int y) {
    super("rangeChar", 5, 8, 65, 1, 4, 0.0, 0, x, y);
    this.name = name;
    this.accuracy = 0.9;
    this.range = 10;
  }

  @Override
  public void step() {
    System.out.println("Усиливает союзника");
  }
}
