public record Denomination(String name, double amt, String form, String img){
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
