public class Kat {
    private String race;
    private boolean sex;
    private double weight;

    public Kat(String race, boolean sex, double weight) {
        this.race = race;
        this.sex = sex;
        this.weight = weight;
    }

    public void udskriv() {
        System.out.print("Race: " + this.race);
        if (sex == true) {
            System.out.print(" male");
        } else {
            System.out.print("it's a she");
        }
        System.out.print(" vægt: " + this.weight);
    }

}