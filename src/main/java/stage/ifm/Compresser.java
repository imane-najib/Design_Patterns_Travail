package stage.ifm;

public abstract class Compresser {
    public int [] LireFichier(String file){
        System.out.println("LIRE UN FICHIER");
        return null;
    }
    public void enregister(int[] data){
        System.out.println("ENREGISTRER UN FICHIER");
    }
    public abstract int[] compresser(int[] data);
}
