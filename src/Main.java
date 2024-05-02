import javax.swing.JOptionPane;

import classes.Sandwich;
import classes.SandwichBuilder;
import classes.XBurguerDirector;
import classes.XTudoDirector;

public class Main {
  public static void main(String[] args) {
    XTudoDirector xtudoDirector = new XTudoDirector();
    XBurguerDirector xburguerDirector = new XBurguerDirector();

    SandwichBuilder baseSandwich = new SandwichBuilder();

    xtudoDirector.constructXTudoSandwich(baseSandwich);
    Sandwich xtudo = baseSandwich.getResult();

    xburguerDirector.constructXBurguerSandwich(baseSandwich);
    Sandwich xbacon = baseSandwich.getResult();

    int option = -1;

    
    do {
      option = Integer.parseInt(JOptionPane.showInputDialog(
          "--------- Menu ---------\n" + "1 - Montar seu sanduiche\n" + "2 - Cardapio\n" + "0 - Finalizar\n"));

      switch (option) {
        case 1:
          baseSandwich.reset();
          Sandwich customSandwich = baseSandwich.getResult();
          int value = 0;

          value = Integer.parseInt(JOptionPane.showInputDialog("Quantos paes: "));
          customSandwich.setNumBread(value);

          value = Integer.parseInt(JOptionPane.showInputDialog("Quantos bacons: "));
          customSandwich.setNumBacon(value);

          value = Integer.parseInt(JOptionPane.showInputDialog("Quantos queijos: "));
          customSandwich.setNumCheese(value);

          value = Integer.parseInt(JOptionPane.showInputDialog("Quantas cebolas: "));
          customSandwich.setNumOnion(value);

          value = Integer.parseInt(JOptionPane.showInputDialog("Quantos hamburguers: "));
          customSandwich.setNumHamburguer(value);

          customSandwich.showProduct("Customizado");

          option = 0;

          break;
        case 2:
          System.out.println("---------------- Cardapio ---------------- \n\n");

          xtudo.showProduct("X-tudo");
          xbacon.showProduct("X-bacon");
          break;

        default:
          System.out.println("Opção Invalida !!! ");
          break;
      }

    } while (option != 0);

  }
}