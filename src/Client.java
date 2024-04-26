import java.util.Scanner;

public class Client {
    Magasin magasin;

    public Client(Magasin magasin) {
        this.magasin = magasin;
    }

    // Méthode pour permettre au client de prendre un produit en spécifiant les coordonnées
    public void prendreProduit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez la colonne de l'emplacement : ");
        int colonne = scanner.nextInt();
        System.out.println("Saisissez la rangée de l'emplacement : ");
        int rangee = scanner.nextInt();
        Produit produitObtenu = magasin.prendreProduit(colonne, rangee);
        if (produitObtenu != null) {
            System.out.println("Produit pris avec succès : " + produitObtenu.nature + " " + produitObtenu.marque);
        } else {
            System.out.println("Aucun produit disponible à cet emplacement.");
        }
    }
}
