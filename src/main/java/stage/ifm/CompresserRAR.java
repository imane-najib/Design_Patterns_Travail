package stage.ifm;

public class CompresserRAR extends Compresser {
    @Override
    public int[] compresser(int[] data) {
        if (data == null || data.length == 0) {
            return new int[0];
        }
        int count = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[i - 1]) {
                count++;
            }
        }

        int[] compressedData = new int[count];
        compressedData[0] = data[0];

        int index = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[i - 1]) {
                compressedData[index] = data[i];
                index++;
            }
        }

        return compressedData;
    }
}