package patterns.model;

import patterns.model.Visitor;
import specialAlign.SpecialAlignLastLab;
import patterns.model.AlignStrategy;

public class Paragraph implements Element {
  private String text;
  private SpecialAlignLastLab align;

  public Paragraph(String text) {
    this.text = text;
  }

  @Override
  public void print() {
    System.out.println(text);
  }

  @Override
  public void add(Element element) {
    System.out.println("ERORR");
  }

  @Override
  public void remove(Element element) {
    System.out.println("ERORR");

  }

  @Override
  public Element getElement(int index) {
    System.out.println("ERORR");
    return null;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
  
  public void setAlignStrategy(SpecialAlignLastLab alignStrategy) {
	    this.align = alignStrategy;
	  }
}