package specialAlign;

import patterns.model.AlignStrategy;

public class SpecialAlignLastLab implements AlignStrategy{
	
	@Override
	  public void print(String text) {
	    System.out.println("$" + text + "$");
	  }

}
