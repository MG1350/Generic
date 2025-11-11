public class Driver {
    public static void main(String[] args) {
        // Create a Camera and a Drone
        Camera cam = new Camera(24.5);
        Drone drone = new Drone(120.0);

        // Create ShippingContainers
        ShippingContainer<Camera> cameraContainer = new ShippingContainer<>(cam, 15.2);
        ShippingContainer<Drone> droneContainer = new ShippingContainer<>(drone, 25.7);

        // Display contents
        System.out.println(cameraContainer);
        System.out.println(droneContainer);

        // Test validation
        Camera lowResCam = new Camera(0.5);
        Drone lowHeightDrone = new Drone(-10.0);
        System.out.println(new ShippingContainer<>(lowResCam, 10.0));
        System.out.println(new ShippingContainer<>(lowHeightDrone, 20.0));
    }
}
