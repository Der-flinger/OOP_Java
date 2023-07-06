public class meleeCharacter extends character{
    private float ability;

    public meleeCharacter() {
        super(null, 0, 0, 0, 0, 0);
        this.ability = r.nextFloat(0, 1);
    }
}
