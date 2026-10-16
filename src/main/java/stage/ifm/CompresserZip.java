package stage.ifm;

public class CompresserZip extends Compresser {
    @Override
    public int[] compresser(int[] data) {
        if (data == null) return new int[0];

        int count = 0;
        for (int value : data) {
            if (value != 0) count++;
        }

        int[] compressedData = new int[count];
        int index = 0;
        for (int value : data) {
            if (value != 0) {
                compressedData[index++] = value;
            }
        }
        return compressedData;
    }
}