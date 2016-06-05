package name;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-05-27
 */
public class Name {
    private String firstName;
    private String lastName;
    private String name;

    public Name() {
        this.firstName = "";
        this.lastName = "";
        this.name = "";
    }
    public Name(String firstName,String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = this.firstName + " " + this.lastName;
    }

    public String upperLastName(){
        return firstName + " " + lastName.toUpperCase();
    }
    public String reversed(){
        return lastName + " " + firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args){
        String name1 = "Kalle Karlsson";

        String name2 = new String("Pelle Petterson");

        Name name3 = new Name("John","Jonsson");

        System.out.println("name.Name 1: " + name1);
        System.out.println("name.Name 2: " + name2);
        System.out.println("name.Name 3: " + name3.name);
        System.out.println("name.Name 3 reversed: " + name3.reversed());
        System.out.println("name.Name 3 last name uppercase: " + name3.upperLastName());

    }

}
