package stage.ifm;

public class FilterImp2 implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {

            result[i] = data[i]-200;
        }
        return result;
    }
}
