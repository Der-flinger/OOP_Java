import characters.*;
import java.util.ArrayList;
import java.util.Random;
import main_templates.*;

public class base_programm {

  public static void main(String[] args) {
    System.out.println();

    ArrayList<character> team1 = new ArrayList<>();
    ArrayList<character> team2 = new ArrayList<>();
    int teamslength = 10;
    fillArray(team1, teamslength, 1);
    fillArray(team2, teamslength, 9);
    printArray(team1);
    System.out.println("---".repeat(13));
    printArray(team2);

    // rangeCharacter hero1 = new Enchanter("buffer", 1, 2);
    // hero1.getCharInfo();
    // hero1.step();
    // hero1.getExtendedInfo();
  }

  /**
   * Метод для заполнения армии существами
   *
   * @param array       армия с существами
   * @param arrayLenght кол-во существ в армии
   */
  public static void fillArray(ArrayList<character> array, int arrayLenght, int posX) {
    int key;
    for (int i = 0; i < arrayLenght; i++) {
      key = new Random().nextInt(0, 6);
      switch (key) {

        case 0:
          array.add(new Enchanter("buffer", posX, i));
          break;

        case 1:
          array.add(new Marksman("shooter", posX, i));
          break;

        case 2:
          array.add(new Peasant("support", posX, i));
          break;

        case 3:
          array.add(new Pikeman("warrior", posX, i));
          break;

        case 4:
          array.add(new Priest("healer", posX, i));
          break;

        case 5:
          array.add(new Rogue("warrior", posX, i));
          break;

        case 6:
          array.add(new Sniper("shooter", posX, i));
          break;
      }
    }
  }

  /**
   * Метод информирующий про существ в армии
   *
   * @param array     армия с существами
   * @param charCount подсчет кол-ва существ в армии
   */
  public static void printArray(ArrayList<character> array) {
    int charCount = array.size();
    array.forEach(el -> el.getCharInfo());
    System.out.printf("Кол-во существ в команде равно %d", charCount);
    System.out.println();
  }

  // character hero2 = new Marksman("shooter");
  // hero2.getCharInfo();
  // hero2.step();
  // hero2.getExtendedInfo();

  // Priest hero3 = new Priest("healer");
  // hero3.getCharInfo();
  // hero3.step();
  // hero3.getExtendedInfo();

  // rangeCharacter hero4 = new Sniper("shooter");
  // hero4.getCharInfo();
  // hero4.step();
  // hero4.getExtendedInfo();

  // Peasant hero5 = new Peasant("support");
  // hero5.getCharInfo();
  // hero5.step();
  // hero5.getExtendedInfo();

  // meleeCharacter hero6 = new Pikeman("warrior");
  // hero6.getCharInfo();
  // hero6.step();
  // hero6.getExtendedInfo();

  // meleeCharacter hero7 = new Rogue("warrior");
  // hero7.getCharInfo();
  // hero7.step();
  // hero7.getExtendedInfo();
}
