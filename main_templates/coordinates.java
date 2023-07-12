package main_templates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Класс, отвечающий за местоположение существ на карте сражения
 */
public class coordinates {

  protected int x;
  protected int y;

  public coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static void getCoordinates(character ch) {
    int x = ch.getX(ch);
    int y = ch.getY(ch);
    System.out.printf("position--> %d, %d", x, y);
  }

  public static int getDistance(character ch1, character ch2) {
    return (int) Math.sqrt(Math.pow(getX(ch1) - getX(ch2), 2) + Math.pow(getY(ch1) - getY(ch2), 2));
  }

  public static int getMinDistance(ArrayList<character> array1, ArrayList<character> array2) {
    ArrayList<Integer> distances = new ArrayList<>();
    for (int i = 0; i < array1.size(); i++) {
      for (int j = 0; j < array2.size(); j++) {

        distances.add(getDistance(array1.get(i), array2.get(j)));
      }
    }
    Collections.sort(distances);
    return distances.get(0);
  }

  public static int getX(character ch) {
    return ch.position.x;
  }

  public static int getY(character ch) {
    return ch.position.y;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("x:%d, y:%d", x, y);
  }
}
