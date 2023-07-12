package characters;
import main_templates.meleeCharacter;

/**
 * Разбойник
 */
public class Rogue extends meleeCharacter{
    
    public Rogue(String name, int x, int y) {
        super("meleeChar", 4, 9, 70, 2, 5, 0.0, x, y);
        this.name = name;
        this.ability = 0.95;
    }

    @Override
    public void step() {
        System.out.println("Отвлекает противника и заставляет пропускать ход");
    }
}
