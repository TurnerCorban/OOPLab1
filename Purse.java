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
    HashMap<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    public Purse() {
        this.amt = amt;
    }

    public void add(Denomination type, int num){
        cash.put(type, num);
    }

    public double remove(Denomination type, int num){
        return 0;
    }

    public double getValue() {
        return amt;
    }

    public String toString(){
        String output = "";
        int temp = 0;
        temp = cash.get(onehundred);
        if ((temp = cash.get(onehundred)) > 0) output += (temp + " Hundred Dollar Bills\n");
        if ((temp = cash.get(fifty)) > 0) output += (temp + " Fifty Dollar Bills\n");
        if ((temp = cash.get(twenty)) > 0) output += (temp + " Twenty Dollar Bills\n");
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
}
