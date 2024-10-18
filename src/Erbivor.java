public abstract class Erbivor implements Animal {
    // Variabile specifice erbivorelor
    protected String habitat;

    // Constructor
    public Erbivor(String habitat) {
        this.habitat = habitat;
    }

    // Metodă abstractă
    public abstract void graze(); // Metodă pentru pășunat

    // Metodă cu corp de metodă
    public void describeHabitat() {
        System.out.println("Habitatul acestui erbivor este: " + habitat);
    }
}