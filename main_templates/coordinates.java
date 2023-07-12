package main_templates;

/**
 * Класс, отвечающий за местоположение существ на карте сражения
 */
public class coordinates {

  int x;
  int y;

  public coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public static void setCoordinates(int x, int y) {
    x = getX(x);
    y = getY(y);
  }

  public static int getX(int x) {
    return x;
  }

  public static int getY(int y) {
    return y;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("x:%d, y:%d", x, y);
  }
}
