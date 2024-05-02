package classes;

import interfaces.Builder;

public class XTudoDirector {

  public void constructXTudoSandwich(Builder builder) {
    builder.reset();
    builder.setBread(2);
    builder.setCheese(2);
    builder.setHamburger(1);
    builder.setBacon(3);
    builder.setOnion(1);
  }

}
