package stage.ifm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] data = { 150, 200, 0, 0, 50, 130, 255, 0 };
        System.out.println("Données initiales : " + Arrays.toString(data));


        Image image = new Image();

        System.out.println("\n--- SAISIE DES CLASSES D'IMPLÉMENTATION ---");
        System.out.println("Exemples valides : stage.ifm.FilterImp1, stage.ifm.CompresserZip");

        System.out.print("Nom complet de la classe de Filtre : ");
        String nomFiltre = scanner.nextLine();

        System.out.print("Nom complet de la classe de Compresseur : ");
        String nomCompresseur = scanner.nextLine();

        try {

            Class<?> classFiltre = Class.forName(nomFiltre);
            FilterStrategy filtre = (FilterStrategy) classFiltre.getDeclaredConstructor().newInstance();


            image.setFilterStrategy(filtre);

            Class<?> classCompresseur = Class.forName(nomCompresseur);
            Compresser compresseur = (Compresser) classCompresseur.getDeclaredConstructor().newInstance();


            image.setCompresser(compresseur);


            System.out.println("\n--- EXECUTION DES TRAITEMENTS ---");


            System.out.println("Application du filtre...");
            data = image.getFilterStrategy().filter(data);

            System.out.println("Résultat après filtre : " + Arrays.toString(data));


            System.out.println("Application de la compression...");
            data = image.getCompresser().compresser(data);
            System.out.println("Résultat après compression : " + Arrays.toString(data));


            compresseur.enregister(data);
            System.out.println("--- FIN DU TRAITEMENT ---");

        } catch (Exception e) {
            System.out.println("\nERREUR inattendue : " + e.getMessage());
        }

        scanner.close();
    }
}