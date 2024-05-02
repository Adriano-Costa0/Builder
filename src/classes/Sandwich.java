package classes;

public class Sandwich {

  private int numBacon;
  private int numBread;
  private int numOnion;
  private int numCheese;
  private int numHamburguer;

  public int getNumBacon() {
    return numBacon;
  }

  public void setNumBacon(int numBacon) {
    this.numBacon = numBacon;
  }

  public int getNumBread() {
    return numBread;
  }

  public void setNumBread(int numBread) {
    this.numBread = numBread;
  }

  public int getNumOnion() {
    return numOnion;
  }

  public void setNumOnion(int numOnion) {
    this.numOnion = numOnion;
  }

  public int getNumCheese() {
    return numCheese;
  }

  public void setNumCheese(int numCheese) {
    this.numCheese = numCheese;
  }

  public int getNumHamburguer() {
    return numHamburguer;
  }

  public void setNumHamburguer(int numHamburguer) {
    this.numHamburguer = numHamburguer;
  }

  public void showProduct(String title){
    System.err.println("\n ------ Sanduiche "+title+" ------ \n");
    System.out.println(getNumBread() + " Pao");
    System.out.println(getNumBacon() + " Bacon");
    System.out.println(getNumCheese() + " Queijo");
    System.out.println(getNumHamburguer() + " Hamburguer");
    System.out.println(getNumOnion() + " Cebola");
  }

}
