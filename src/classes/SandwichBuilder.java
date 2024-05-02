package classes;

import interfaces.Builder;

public class SandwichBuilder implements Builder {

  private Sandwich sanduba;

  public SandwichBuilder() {
    this.reset();
    this.setBacon(0);
    this.setBread(0);
    this.setOnion(0);
    this.setCheese(0);
    this.setHamburger(0);
  }

  @Override
  public void setBread(int number) {
    this.sanduba.setNumBread(number);
  }

  @Override
  public void setCheese(int number) {
    this.sanduba.setNumCheese(number);
  }

  @Override
  public void setHamburger(int number) {
    this.sanduba.setNumHamburguer(number);
  }

  @Override
  public void setBacon(int number) {
    this.sanduba.setNumBacon(number);
  }

  @Override
  public void setOnion(int number) {
    this.sanduba.setNumOnion(number);
  }

  @Override
  public Sandwich getResult() {
    return this.sanduba;
  }

  @Override
  public void reset() {
    this.sanduba = new Sandwich();
  }

}
