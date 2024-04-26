import java.util.Scanner;

public class Produit {
    String nature;
    String marque;

    public Produit(String nature, String marque) {
        this.nature = nature;
        this.marque = marque;
    }

    // Méthode pour créer un produit en demandant à l'utilisateur de saisir la nature et la marque
    public static Produit creerProduit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez la nature du produit : ");
        String nature = scanner.nextLine();
        System.out.println("Saisissez la marque du produit : ");
        String marque = scanner.nextLine();
        return new Produit(nature, marque);
    }
}

