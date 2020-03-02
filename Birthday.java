import javax.swing.JOptionPane;
import java.util.Random;
/**
 * The Birthday class with get the name, age, and toy the child wants, as well as print the cost, total cost, and order number.
 * it contains the driver function
 */

/**
 * @author Daniel Sukinik
 *
 */
public class Birthday {
	/** all class wide varibales, including the Toy class variable*/
  private static final String programmer = "Daniel Sukinik";
  private static String name;
  private static String ageConverter;
  private static int age;
  private static double totalCost = 0;
  private static String toy;
  private static String card;
  private static String balloon;
  public static Toy toys = new Toy();
  private static double cost = 0;
	/**
	 * @param args
	 * Driver Function
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Random numGen = new Random();
	  Boolean confirmation = false;
	  Boolean doItAgain = false;
	  Boolean ageOkMain = true;
	  Integer maxRange = 10000;
	  String confirmationConv = "";
	  /**into dialog w/ JOptionPane*/
	  JOptionPane.showMessageDialog(null, "Welcome to the Toy Company,\nto chose gifts for young children");
	  System.out.println("BIRTHDAY GIFTS\n\n");
	  /** get name and age and return them*/
	  do {
	  name = JOptionPane.showInputDialog(null, "Enter the name of the child:");
	  ageConverter = JOptionPane.showInputDialog(null, "Enter the age of the child:");
	  age = Integer.parseInt(ageConverter);
	  toys.setAge(age);
	  /** get toy, confirm toy */
	  do {
	    do {
		    toy = JOptionPane.showInputDialog(null, "Chose a toy: a Plushie, Blocks, or a Book");
		    confirmationConv = JOptionPane.showInputDialog(null, "Is this toy, (a) " + toy +", the one you want? (Yes or No)");
		    if (confirmationConv.equalsIgnoreCase("yes") ) {
			    confirmation = true;
		    }
		    else {
			    confirmation = false;
		    }
		  
		  
	       }while (confirmation == false);
	  toys.setToy(toy);
	  toys.setCost(toy);
	  ageOkMain = toys.ageOK();
	  /** confirm that age is ok for toy*/
	  if (ageOkMain == false) {
		  confirmationConv = JOptionPane.showInputDialog(null, "This toy is not meant for someone of this age.\nGet it anyways? (Yes or No");
		  if (confirmationConv.equalsIgnoreCase("yes")) {
			  confirmation = true;
		  }
		  else {
			  confirmation = false;
		  }
	  }
	  
	  
	  }while (ageOkMain == false);
	  /** ask for card and balloons, return values*/
	  card = JOptionPane.showInputDialog(null, "Do you want a card? (Yes or No)");
	  balloon = JOptionPane.showInputDialog(null, "Do you want a ballon?(Yes or no)");
	  toys.addBalloon(balloon);
	  toys.addCard(card);
	  /** get cost and total cost, return values*/
	  cost = toys.getCost();
	  totalCost += cost;
	  /** print reciept for toy*/
	  System.out.println("The gift for " + name + toys.toString() + "\n");
	  /** option to place another order*/
	  confirmationConv = JOptionPane.showInputDialog(null, "Would you like to place another order? (Yes or No)");
	  if (confirmationConv.equalsIgnoreCase("yes")) {
		  doItAgain = true;
	  }
	  else {
		  doItAgain = false;
	  }
	  }while (doItAgain == true);
	  /** print order number, total cost, and programmer name*/
	  System.out.println("The total cost for your order is $" + toys.dollar.format(totalCost) + ".\nYour order number is: " + numGen.nextInt(maxRange));
	  System.out.println("\n\nProgrammer: " + programmer);
	  /**exit program*/
	  System.exit(0);

	}

}
