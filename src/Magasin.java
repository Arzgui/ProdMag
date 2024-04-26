import java.util.ArrayList;
import java.util.Scanner;

public class Magasin {
    ArrayList<ArrayList<Emplacement>> emplacements;

    public Magasin(int nombreDeColonnes, int nombreDeRangees) {
        this.emplacements = new ArrayList<>(nombreDeColonnes);

        for (int i = 0; i < nombreDeColonnes; i++) {
            emplacements.add(new ArrayList<>(nombreDeRangees));
            for (int j = 0; j < nombreDeRangees; j++) {
                emplacements.get(i).add(new Emplacement(i + 1, j + 1));
            }
        }
    }

    public void remplirEmplacement(int colonne, int rangee, Produit produit) {
        Emplacement emplacement = emplacements.get(colonne - 1).get(rangee - 1);
        emplacement.produits.addAll(repeterProduit(produit, 3));
    }

    public Produit prendreProduit(int colonne, int rangee) {
        Emplacement emplacement = emplacements.get(colonne - 1).get(rangee - 1);
        if (!emplacement.produits.isEmpty()) {
            return emplacement.produits.remove(0);
        } else {
            System.out.println("Stock épuisé. Ajout de nouveaux produits.");
            Produit nouveauProduit = Produit.creerProduit();
            remplirEmplacement(colonne, rangee, nouveauProduit);
            return nouveauProduit;
        }
    }

    private ArrayList<Produit> repeterProduit(Produit produit, int nombreDeFois) {
        ArrayList<Produit> produits = new ArrayList<>();
        for (int i = 0; i < nombreDeFois; i++) {
            produits.add(new Produit(produit.nature, produit.marque));
        }
        return produits;
    }
}
