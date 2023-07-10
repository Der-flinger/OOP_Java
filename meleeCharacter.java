/**
 * Класс, отвечающий за персонажей ближнего боя
 * @param ability оотвечает за навыки владения оружием (если равен 50%, то персонаж попадет по противнику с такой вероятностью) 
 */
public abstract class meleeCharacter extends character{
    private Double ability;

    public meleeCharacter(String name, int lvl, int power, int hp, int speed, int defense, Double ability) {
        super(null, 1, 2, 50, 1, 20);
        this.ability = ability;
    }

    public meleeCharacter() {
        this(null, 1, 2, 50, 1, 20, 0.1);
        this.ability = r.nextDouble();
    }

    @Override
    public void getExtendInfo() {
        System.out.println(String.format("power = %d | speed = %d | defense = %d | ability = %f | type: %s", this.power, this.speed, this.defense, this.ability, this.getClass().getCanonicalName()));
    }
    
}
