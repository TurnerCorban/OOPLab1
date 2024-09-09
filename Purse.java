import javax.swing.*;
import java.util.HashMap;

public class Purse{
    private double amt = 0;
    static Denomination quarter = new Denomination("Quarter", 0.25, "coin", "quarter.png");
    static Denomination dime = new Denomination("Dime", 0.10, "coin", "dime.png");
    static Denomination nickel = new Denomination("Nickel", 0.05, "coin", "nickel.png");
    static Denomination penny = new Denomination("Penny", 0.01, "coin", "penny.png");
    static Denomination one = new Denomination("One Dollar Note", 1, "bill", "one_note.png");
    static Denomination five = new Denomination("Five Dollar Note", 5, "bill", "five_note.png");
    static Denomination ten = new Denomination("Ten Dollar Note", 10, "bill", "ten_note.png");
    static Denomination twenty = new Denomination("Twenty Dollar Note", 20, "bill", "twenty_note.png");
    static Denomination fifty = new Denomination("Fifty Dollar Note", 50, "bill", "fifty_note.png");
    static Denomination onehundred = new Denomination("One Hundred Dollar Note", 100, "bill", "hundred_note.png");
    static HashMap<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    public Purse() {
        this.amt = amt;
    }

    public void add(Denomination type, int num){
        cash.put(type, num);
    }

    public double remove(Denomination type, int num){
        return 0;
    }

    public double getValue(Denomination type) {
        return cash.get(type);
    }

    public static String getImg(Denomination type){

        return type.img();
    }

    public String toString(){
        String output = "";
        int temp = 0;
        temp = cash.get(onehundred);
        if ((temp = cash.get(onehundred)) > 0) output += (temp + " Hundred Dollar Bills\n");
        if ((temp = cash.get(fifty)) > 0) output += (temp + " Fifty Dollar Bills\n");
        if ((temp = cash.get(twenty)) > 0) output += (temp + " Twenty Dollar Bills\n");
        if ((temp = cash.get(ten)) > 0) output += (temp + " Ten Dollar Bills\n");
        if ((temp = cash.get(five)) > 0) output += (temp + " Five Dollar Bills\n");
        if ((temp = cash.get(one)) > 0) output += (temp + " One Dollar Bills\n");
        if ((temp = cash.get(quarter)) > 0) output += (temp + " Quarters\n");
        if ((temp = cash.get(dime)) > 0) output += (temp + " Dimes\n");
        if ((temp = cash.get(nickel)) > 0) output += (temp + " Nickles\n");
        if ((temp = cash.get(penny)) > 0) output += (temp + " Pennies\n");
        if (output == ""){
            output = "Empty Purse";
        }

        return output;
    }
    public String toStringHtml(){
        String output = "<html>";
        int temp = 0;
        temp = cash.get(onehundred);
        if ((temp = cash.get(onehundred)) > 0) output += (temp + " Hundred Dollar Bills <br>");
        if ((temp = cash.get(fifty)) > 0) output += (temp + " Fifty Dollar Bills <br>");
        if ((temp = cash.get(twenty)) > 0) output += (temp + " Twenty Dollar Bills <br>");
        if ((temp = cash.get(ten)) > 0) output += (temp + " Ten Dollar Bills <br>");
        if ((temp = cash.get(five)) > 0) output += (temp + " Five Dollar Bills <br>");
        if ((temp = cash.get(one)) > 0) output += (temp + " One Dollar Bills <br>");
        if ((temp = cash.get(quarter)) > 0) output += (temp + " Quarters <br>");
        if ((temp = cash.get(dime)) > 0) output += (temp + " Dimes <br>");
        if ((temp = cash.get(nickel)) > 0) output += (temp + " Nickles <br>");
        if ((temp = cash.get(penny)) > 0) output += (temp + " Pennies <br>");
        output += "<html>";
        if (output.equals("<html><html>")){
            output = "Empty Purse";
        }

        return output;
    }
}

record Denomination(String name, double amt, String form, String img){
    public Denomination(String name, double amt, String form, String img){
        this.name = name;
        this.amt = amt;
        this.form = form;
        this.img = img;
    }

    public String getName() {
        return name;
    }
    public final double getAmt() {
        return amt;
    }
    public String getForm() {
        return form;
    }
    public String getImg() {
        return img;
    }
}
