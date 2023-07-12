package characters;

import main_templates.rangeCharacter;

/**
 * Арбалетчик
 */
public class Marksman extends rangeCharacter {

    public Marksman(String name, int x, int y) {
        super("rangeChar", 3, 4, 60, 2, 8, 0.0, 0, x, y);
        this.name = name;
        this.accuracy = 0.6;
        this.range = 8;
    }

    @Override
    public void step() {
        System.out.println("Стреляет из арбалета");
    }
}
