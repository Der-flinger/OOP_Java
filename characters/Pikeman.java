package characters;
import main_templates.meleeCharacter;

/**
 * Копейщик
 */
public class Pikeman extends meleeCharacter {
    
    public Pikeman(String name, int x, int y) {
        super("meleeChar", 3, 7, 80, 1, 10, 0.0, x, y);
        this.name = name;
        this.ability = 0.8;
    }

    @Override
    public void step() {
        System.out.println("Наносит удар пикой");
    }
}
