package interfaces;

import classes.Sandwich;

public interface Builder {
  public void setBread(int number);

  public void setCheese(int number);

  public void setHamburger(int number);

  public void setBacon(int number);

  public void setOnion(int number);

  public void reset();

  public Sandwich getResult();
}
