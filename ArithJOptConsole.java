package lab1b;

import java.util.*;
import javax.swing.*;

public class ArithJOptConsole {

    /**
     * Creates a new instance of ArithJOptConsole
     */
    public ArithJOptConsole() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare and initialize variables 
        int half_d = 0, //half dollars
                quarters = 0, //quarters
                dimes = 0, //dimes
                nickels = 0, //nickels
                pennies = 0;        //pennies
        int total_cents = 0;    //total cents
        int dollars, cents;     //dollars and cents
        String str_coin_50 = "", //string for half dollars
                str_coin_25 = "", //string for quarters
                str_coin_10 = "", //string for dimes
                str_coin_05 = "", //string for nickels
                str_coin_01 = "";   //string for pennies
        String outputStr = "";      //output string

        // Obtain first coin value from the user via a popup dialog
        str_coin_50 = JOptionPane.showInputDialog("Enter number of half dollars");
        half_d = Integer.parseInt(str_coin_50);

        str_coin_25 = JOptionPane.showInputDialog("Enter number of quarters");
        quarters = Integer.parseInt(str_coin_25);

        str_coin_10 = JOptionPane.showInputDialog("Enter number of dimes");
        dimes = Integer.parseInt(str_coin_10);

        str_coin_05 = JOptionPane.showInputDialog("Enter number of nickels");
        nickels = Integer.parseInt(str_coin_05);

        str_coin_01 = JOptionPane.showInputDialog("Enter number of pennies");
        pennies = Integer.parseInt(str_coin_01);

        //calculate how many cents are contained in these coins
        //total_cents += half_d * 50;
        total_cents = total_cents + (half_d * 50) + (quarters * 25)
                + (dimes * 10) + (nickels * 5) + (pennies);

        dollars = total_cents / 100;
        cents = total_cents % 100;
        //calculate the dollars and cents
        //dollars are the result of the total cents divided by 100
        //and cents will be the remainder.
        //YOUR CODE HERE
        //output
        outputStr += "In a piggy bank containing \n\t"
                + half_d + " half dollars \n\t"
                + quarters + " quarters \n\t"
                + dimes + " dimes \n\t"
                + nickels + " nickels\n\t"
                + pennies + " pennies\n\t"
                + "the total amount is " + dollars + " dollars and " + cents + " cents";

        System.out.println(outputStr);
        JOptionPane.showMessageDialog(null, outputStr, "Total Amounts",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
