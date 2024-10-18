public class Elefant implements Animal {

     private String nume;
    private int varsta;

    // Constructor
    public Elefant(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // Implementarea metodelor din interfața Animal
    @Override
    public void eat() {
        System.out.println(nume + " mănâncă iarba și frunzele.");
    }

    @Override
    public void sleep() {
        System.out.println(nume + " doarme in piciaore.");
    }

    @Override
    public void makeSound() {
        System.out.println(nume + " scoate sunete de tropeta.");
    }

    @Override
    public void move() {
        System.out.println(nume + " se deplasează încet.");
    }

    // Metoda info, moștenită din interfața Animal
    @Override
    public void info() {
     //   super.info();
        System.out.println("Nume: " + nume + ", Vârstă: " + varsta);
    }
    // Poate adăugați și alte metode specifice pentru clasa Elefant
}