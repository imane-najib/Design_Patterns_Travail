package stage.ifm;

public class FilterImp1 implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        int seuil = 128;
        for (int i = 0; i < data.length; i++) {
            result[i] = (data[i] > seuil) ? 255 : 0;
        }
        return result;
    }
}
