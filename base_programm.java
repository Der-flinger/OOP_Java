
public class base_programm {

    // String name, int lvl, int power, int hp, int speed, int defense
    public static void main(String[] args) {
        System.out.println();

        // character ench = new Enchanter();
        // character mks = new Marksman();
        // character psn = new Peasant();
        // character pkm = new Pikeman();
        // character prs = new Priest();
        // character rg = new Rogue();
        // character snp = new Sniper();

        rangeCharacter hero1 = new Enchanter("buffer");
        hero1.getCharInfo();
        hero1.step();
        hero1.getExtendInfo();

        character hero2 = new Marksman("shooter");
        hero2.getCharInfo();
        hero2.step();
        hero2.getExtendInfo();
        
        character hero3 = new Priest("healer");
        hero3.getCharInfo();
        hero3.step();
        hero3.getExtendInfo();
        
        rangeCharacter hero4 = new Sniper("shotter");
        hero4.getCharInfo();
        hero4.step();
        hero4.getExtendInfo();
    }
}