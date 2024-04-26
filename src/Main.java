import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez le nombre de colonnes dans le magasin : ");
        int nombreDeColonnes = scanner.nextInt();
        System.out.println("Saisissez le nombre de rangées dans le magasin : ");
        int nombreDeRangees = scanner.nextInt();

        Magasin magasin = new Magasin(nombreDeColonnes, nombreDeRangees);
        InterfaceMagasin interfaceMagasin = new InterfaceMagasin(magasin);
        Personnel personnel = new Personnel(magasin);
        Client client = new Client(magasin);

        Produit cafeMaxbien = Produit.creerProduit();
        Produit laitNeness = Produit.creerProduit();

        System.out.println("Saisissez les coordonnées pour remplir l'emplacement de Café Maxbien : ");
        int colonneCafe = scanner.nextInt();
        int rangeeCafe = scanner.nextInt();
        interfaceMagasin.remplirEmplacement(colonneCafe, rangeeCafe, cafeMaxbien);

        System.out.println("Saisissez les coordonnées pour remplir l'emplacement de Lait Neness : ");
        int colonneLait = scanner.nextInt();
        int rangeeLait = scanner.nextInt();
        interfaceMagasin.remplirEmplacement(colonneLait, rangeeLait, laitNeness);

        System.out.println("Saisissez les coordonnées pour prendre un produit en tant que client : ");
        client.prendreProduit();

        System.out.println("Saisissez les coordonnées pour remplir un emplacement en tant que personnel : ");
        int colonnePersonnel = scanner.nextInt();
        int rangeePersonnel = scanner.nextInt();
        personnel.remplirEmplacement(colonnePersonnel, rangeePersonnel);
    }
}
