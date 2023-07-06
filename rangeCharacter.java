
public class rangeCharacter extends character{
    private float accuracy;
    private int range;

    public rangeCharacter() {
        super(null, 0, 0, 0, 0, 0);
        this.accuracy = r.nextFloat(0, 1);
        this.range = 10;

    }
}
// String name, int lvl, int power, int hp, int speed, int defense