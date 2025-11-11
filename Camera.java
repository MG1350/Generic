public class Camera {
    private double resolution; // in Megapixels

    public Camera(double resolution) {
        setResolution(resolution);
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        if (resolution < 1.0) {
            this.resolution = 1.0;
        } else {
            this.resolution = resolution;
        }
    }

    @Override
    public String toString() {
        return "Camera{" + "resolution=" + resolution + " MP}";
    }
}
