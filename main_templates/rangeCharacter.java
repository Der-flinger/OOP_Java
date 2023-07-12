package main_templates;

/**
 * Класс, отвечающий за персонажей дальнего боя
 *
 * @param accuracy отвечает за точность стрельбы
 * @param range    отвечает за дальность стрельбы
 */
public abstract class rangeCharacter extends character {

  protected Double accuracy;
  protected int range;

  public rangeCharacter(String name, int lvl, int power, int hp, int speed, int defense, Double accuracy, int range,
      int x, int y) {
    super(name, lvl, power, hp, speed, defense, x, y);
    this.accuracy = accuracy;
    this.range = range;
  }

  public rangeCharacter(String name, int x, int y) {
    this(null, 1, 5, 40, 1, 3, 0.0, 0, x, y);
    this.name = name;
    this.accuracy = r.nextDouble();
    this.range = 10;
  }

  @Override
  public void getExtendedInfo() {

    System.out
        .println(String.format("power = %d | speed = %d | defense = %d | accuracy = %f | range = %d",
            this.power, this.speed, this.defense, this.accuracy, this.range));

    System.out.println("-------".repeat(13));
  }
}
// String name, int lvl, int power, int hp, int speed, int defense
