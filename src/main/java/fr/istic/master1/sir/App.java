package fr.istic.master1.sir;

/**
 * Hello world!
 *
 */
public class App {

    /**
     * Constructeur.
     */
    private App() {
    }

    /**
     * Unused Method.
     * @param arg argument.
     * @return tmp value.
     */
    public String unusedMethod(String arg) {
        String tmp = arg;
        tmp = arg;
        if(true) {
            return arg;
        } else if(true) {
            return tmp;
        }

        return tmp;
    }

    /**
     * Méthode main.
     * @param args arguments de la commande.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app = new App();
        app.unusedMethod("blabla");
    }
}
