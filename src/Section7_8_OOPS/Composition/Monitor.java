package Section7_8_OOPS.Composition;

public class Monitor extends Product{

        private int size;
        private String resolution;
        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int X, int Y, String color){
        System.out.println(String.format("Drawing pixel at %d,%d in color %s",X,Y,color));
    }
}
