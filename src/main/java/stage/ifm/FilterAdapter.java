package stage.ifm;

public class FilterAdapter implements FilterStrategy {

    private String FilterName;
    private ImplNonStandard implNonStandard;

    @Override
    public int[] filter(int[] data) {
        return new int[0];
    }

    public FilterAdapter(String filterName, ImplNonStandard implNonStandard) {
        FilterName = filterName;
        this.implNonStandard = implNonStandard;
    }
}
