import java.util.ArrayList;

public class Emplacement {
    String colonne;
    int rangee;
    ArrayList<Produit> produits;

    public Emplacement(int colonne, int rangee) {
        this.colonne = colonne;
        this.rangee = rangee;
        this.produits = new ArrayList<>();
    }
}

