package stage.ifm;

public class ImplNonStandard {

    public int[] appliquerFilter(String filterName, int[] data) {
        // Gestion des cas vides ou nuls
        if (data == null || data.length == 0) {
            return new int[0];
        }
        String filtre = (filterName == null) ? "" : filterName.toLowerCase();


        int count = 0;
        for (int valeur : data) {
            if (filtre.equals("pair") && valeur % 2 == 0) {
                count++;
            } else if (filtre.equals("impair") && valeur % 2 != 0) {
                count++;
            } else if (filtre.equals("positif") && valeur > 0) {
                count++;
            } else if (filtre.equals("tout") || filtre.equals("aucun")) {
                count++;
            }
        }


        int[] resultat = new int[count];
        int index = 0;

        for (int valeur : data) {
            if (filtre.equals("pair") && valeur % 2 == 0) {
                resultat[index++] = valeur;
            } else if (filtre.equals("impair") && valeur % 2 != 0) {
                resultat[index++] = valeur;
            } else if (filtre.equals("positif") && valeur > 0) {
                resultat[index++] = valeur;
            } else if (filtre.equals("tout") || filtre.equals("aucun")) {
                resultat[index++] = valeur;
            }
        }

        return resultat;
    }
}