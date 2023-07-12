package main_templates;

/**
 * Класс, отвечающий за персонажей ближнего боя
 *
 * @param ability оотвечает за навыки владения оружием (если равен 50%, то
 *                персонаж попадет по противнику с такой вероятностью)
 */
public abstract class meleeCharacter extends character {

  protected Double ability;

  public meleeCharacter(String name, int lvl, int power, int hp, int speed, int defense, Double ability, int x, int y) {
    super(name, lvl, power, hp, speed, defense, x, y);
    this.ability = ability;
  }

  public meleeCharacter(String name, int x, int y) {
    this(null, 1, 2, 50, 1, 20, 0.1, x, y);
    this.name = name;
    this.ability = 0.7;
  }

  @Override
  public void getExtendedInfo() {

    System.out.println(String.format("power = %d | speed = %d | defense = %d | ability = %f",
        this.power, this.speed, this.defense, this.ability));

    System.out.println("-------".repeat(13));
  }
}
