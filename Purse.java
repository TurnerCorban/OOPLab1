import java.util.HashMap;

public class Purse{
    private double amt = 0;
    HashMap<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    public Purse() {
        this.amt = amt;
    }

    public void add(Denomination type, int num){
        int temp = cash.get(type);
        temp += num;
        cash.put(type, temp);
    }

    public double remove(Denomination type, int num){
        return 0;
    }

    public double getValue() {
        return amt;
    }

    public String toString(){

        return "";
    }
}
