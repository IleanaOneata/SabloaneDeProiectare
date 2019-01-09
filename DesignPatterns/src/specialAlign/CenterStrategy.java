package specialAlign;

import patterns.model.AlignStrategy;

public class CenterStrategy implements AlignStrategy {

  @Override
  public void print(String text) {
    System.out.println("+++" + text + "+++");
  }

}
