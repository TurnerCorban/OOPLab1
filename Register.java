import java.text.DecimalFormat;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        double initialAmt = welcome();
        Purse purse = makeChange(initialAmt);
        System.out.println(purse.toString());
    }

    static Purse makeChange(double amt){
        Purse purse = new Purse();
        DecimalFormat df = new DecimalFormat("0.00");

        int change = (int)(Math.ceil(amt*100));
        purse.add(Purse.onehundred, Math.round((int)change/10000));
        change=change%10000;
        purse.add(Purse.fifty, Math.round((int)change/5000));
        change=change%5000;
        purse.add(Purse.twenty, Math.round((int)change/2000));
        change=change%2000;
        purse.add(Purse.ten, Math.round((int)change/1000));
        change=change%1000;
        purse.add(Purse.five, Math.round((int)change/500));
        change=change%500;
        purse.add(Purse.one, Math.round((int)change/100));
        change=change%100;
        purse.add(Purse.quarter, Math.round((int)change/25));
        change=change%25;
        purse.add(Purse.dime, Math.round((int)change/10));
        change=change%10;
        purse.add(Purse.nickel, Math.round((int)change/5));
        change=change%5;
        purse.add(Purse.penny, Math.round((int)change/1));
        return purse;
    }

    static double welcome() {
        System.out.println("Welcome!\n\n");
        double amt = 0;
        var in = new Scanner(System.in);
        System.out.println("Please enter your balance in numerical form");
        amt = in.nextDouble();
        if (amt < 0.005) {
            amt = 0;
        }
        return amt;
    }
}
