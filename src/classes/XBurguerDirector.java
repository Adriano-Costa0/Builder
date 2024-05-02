package classes;

import interfaces.Builder;

public class XBurguerDirector {

  public void constructXBurguerSandwich(Builder builder) {
    builder.reset();
    builder.setBread(2);
    builder.setCheese(1);
    builder.setHamburger(1);
  }

}
