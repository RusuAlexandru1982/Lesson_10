public interface Animal {

    String SPECIE = "Necunoscut";
    int VARSTE_MAXIME = 7;

    void eat();
    void sleep();
    void makeSound();
    void move();

    default void info() {
        System.out.println("Specia: " + SPECIE + ", Vârsta maximă: " + VARSTE_MAXIME);
    }


    static void animalInfo() {
        System.out.println("Aceasta este un Animal.");
    }
}
