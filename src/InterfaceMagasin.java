public class InterfaceMagasin {
    Magasin magasin;

    public InterfaceMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public void remplirEmplacement(int colonne, int rangee, Produit produit) {
        magasin.remplirEmplacement(colonne, rangee, produit);
    }

    public Produit prendreProduit(int colonne, int rangee) {
        return magasin.prendreProduit(colonne, rangee);
    }

    public void prepareProduit(Produit produit) {
        if (produit != null) {
            System.out.println("Prend gobelet");
            System.out.println("Verse " + produit.nature + " " + produit.marque + " dans gobelet");
            System.out.println("Verse de l'eau chaude");
            System.out.println("Dépose dans le Compartiment de Délivrance");
            System.out.println("Informe le client");
        } else {
            System.out.println("Le produit est null. Impossible de le préparer.");
        }
    }
}
