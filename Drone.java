public class Drone {
    private double maxHeight; // in meters

    public Drone(double maxHeight) {
        setMaxHeight(maxHeight);
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        if (maxHeight < 0.0) {
            this.maxHeight = 0.0;
        } else {
            this.maxHeight = maxHeight;
        }
    }

    @Override
    public String toString() {
        return "Drone{" + "maxHeight=" + maxHeight + " m}";
    }
}
