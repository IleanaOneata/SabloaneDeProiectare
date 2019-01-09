/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package strategy.model;

public interface Element {
  public void add(Element element);

  public void remove(Element element);

  public Element getElement(int index);

  public void print();
}
