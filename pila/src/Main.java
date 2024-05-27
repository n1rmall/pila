import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> frigorifero = new Stack<>();
        frigorifero.push("carne");
        frigorifero.push("formaggi");
        frigorifero.push("pesce");
        frigorifero.push("frutta");
        System.out.println("Contenuti del frigorifero: " + frigorifero);

        frigorifero.pop();
        System.out.println("Contenuto del frigorifero dopo la rimozione: " + frigorifero);

        frigorifero.push("latte");
        System.out.println("Contenuto del frigorifero dopo l'aggiunta: " + frigorifero);

    }
}
