public class Person {

    // private variables
    private String name;
    private int age;

    /*
     * public void setName(String nameIn) { name = nameIn; }
     */

    // constructor
    public Person(String nameIn, int ageIn) {
        name = nameIn;
        age = ageIn;
    }

    // method
    public String getName() {
        return name;
    }

    // method
    public void udskriv() {
        System.out.println("Dit navn er: " + getName() + " og du er " + getAge());
    }

    // method
    public int getAge() {
        return age;
    }
}