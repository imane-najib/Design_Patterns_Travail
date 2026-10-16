package stage.ifm;

public class Image {
   private int [] data;
   private FilterStrategy filterStrategy;
   private Compresser compresser;

   public void setFilterStrategy(FilterStrategy filterStrategy) {
      this.filterStrategy = filterStrategy;
   }

   public void setCompresser(Compresser compresser) {
      this.compresser = compresser;
   }

}
