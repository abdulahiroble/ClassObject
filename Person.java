public class Person {

    private String name;
    private int age;

    /*
     * public void setName(String nameIn) { name = nameIn; }
     */

    public Person(String nameIn, int ageIn) {
        name = nameIn;
        age = ageIn;
    }

    public String getName() {
        return name;
    }

    public void udskriv() {
        System.out.println("Dit navn er: " + getName() + " og du er " + getAge());
    }

    public int getAge() {
        return age;
    }
}