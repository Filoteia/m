package santa;

public class Main {
    public static void main(String[] args) {
        SantaClaus santaClaus = SantaClaus.getInstance();
        int age = 15;

        System.out.println("A  " + age + " years old kid got from Santa Claus a ");

        System.out.println(santaClaus.givePresent(age));

        System.out.println("\nIs there more than one Santa Claus?");
        SantaClaus santaClaus2 = SantaClaus.getInstance();
        System.out.println((santaClaus != santaClaus2)+"!");
    }
}
