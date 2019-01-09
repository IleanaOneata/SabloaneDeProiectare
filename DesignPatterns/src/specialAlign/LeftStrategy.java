package specialAlign;

import patterns.model.AlignStrategy;

public class LeftStrategy implements AlignStrategy {

  @Override
  public void print(String text) {
    System.out.println("+++" + text);
  }

}
