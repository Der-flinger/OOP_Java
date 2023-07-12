package characters;
import main_templates.rangeCharacter;

/**
 * Монах
 */
public class Priest extends rangeCharacter{
    
    public Priest(String name, int x, int y){
        super("rangeChar", 4, 5, 35, 1, 2, 0.0, 0, x, y);
        this.name = name;
        this.accuracy = 0.85;
        this.range = 8;
    }

    @Override
    public void step() {
        System.out.println("Лечит союзника");
    }
}
