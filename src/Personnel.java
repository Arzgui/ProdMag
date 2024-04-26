import java.util.Scanner;

public class Personnel {
    Magasin magasin;

    public Personnel(Magasin magasin) {
        this.magasin = magasin;
    }

    // Méthode pour remplir un emplacement en demandant à l'utilisateur de saisir la nature et la marque du produit
    public void remplirEmplacement(int colonne, int rangee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez la nature du produit à ajouter : ");
        String nature = scanner.nextLine();
        System.out.println("Saisissez la marque du produit à ajouter : ");
        String marque = scanner.nextLine();
        Produit produit = new Produit(nature, marque);
        magasin.remplirEmplacement(colonne, rangee, produit);
        System.out.println("Emplacement rempli avec succès.");
    }
}
