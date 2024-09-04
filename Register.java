import java.text.DecimalFormat;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        double initialAmt = welcome();
        Purse purse = makeChange(initialAmt);
    }

    static Purse makeChange(double amt){
        Purse purse = new Purse();

        DecimalFormat df = new DecimalFormat("0.00");
        Denomination quarter = new Denomination("Quarter", 0.25, "coin", "quarter.png");
        Denomination dime = new Denomination("Dime", 0.10, "coin", "dime.png");
        Denomination nickel = new Denomination("Nickel", 0.05, "coin", "nickel.png");
        Denomination penny = new Denomination("Penny", 0.01, "coin", "penny.png");
        Denomination one = new Denomination("One Dollar Note", 1, "bill", "one_note.png");
        Denomination five = new Denomination("Five Dollar Note", 5, "bill", "five_note.png");
        Denomination ten = new Denomination("Ten Dollar Note", 10, "bill", "ten_note.png");
        Denomination twenty = new Denomination("Twenty Dollar Note", 20, "bill", "twenty_note.png");
        Denomination fifty = new Denomination("Fifty Dollar Note", 50, "bill", "fifty_note.png");
        Denomination OneHundred = new Denomination("One Hundred Dollar Note", 100, "bill", "hundred_note.png");

        int change = (int)(Math.ceil(amt*100));
        purse.add(OneHundred, Math.round((int)change/10000));
        change=change%10000;
        purse.add(fifty, Math.round((int)change/5000));
        change=change%5000;
        purse.add(twenty, Math.round((int)change/2000));
        change=change%2000;
        purse.add(five, Math.round((int)change/500));
        change=change%500;
        purse.add(one, Math.round((int)change/100));
        change=change%100;
        purse.add(quarter, Math.round((int)change/25));
        change=change%25;
        purse.add(dime, Math.round((int)change/10));
        change=change%10;
        purse.add(nickel, Math.round((int)change/5));
        change=change%5;
        purse.add(penny, Math.round((int)change/1));

        return purse;
    }

    static double welcome() {
        System.out.println("Welcome!\n\n");
        double amt = 0;
        var in = new Scanner(System.in);
        do {
            System.out.println("Please enter your balance in numerical form");
            amt = in.nextDouble();
            if (amt < 0.01){
                System.out.println("Please enter a number at least 0.01");
            }
        } while (amt < 0.01);
        return amt;
    }

}
