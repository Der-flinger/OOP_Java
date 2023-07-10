package characters;
import main_templates.meleeCharacter;

/**
 * Класс для крестьянина
 */
public class Peasant extends meleeCharacter {
    
    public Peasant(String name) {
        super("meleeChar", 1, 2, 35, 1, 2, 0.0);
        this.name = name;
        this.ability = 0.5;
    }

    @Override
    public void step() {
        System.out.println("Приносит стрелу арбалетчику");
    }
}
