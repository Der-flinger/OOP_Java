package characters;
import main_templates.rangeCharacter;

/**
 * Стрелок дальнего боя
 */
public class Sniper extends rangeCharacter{
    
    public Sniper(String name, int x, int y){
        super("rangeChar", 5, 7, 50, 2, 4, 0.0, 0, x, y);
        this.name = name;
        this.accuracy = 0.9;
        this.range = 10;
    }

     @Override
     public void step() {
         System.out.println("Стреляет из лука");
     }
}
