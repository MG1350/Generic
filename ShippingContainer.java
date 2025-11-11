public class ShippingContainer<T> {
    private T content;
    private double weight; // in kilograms

    public ShippingContainer(T content, double weight) {
        this.content = content;
        this.weight = weight;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ShippingContainer{" +
                "content=" + content +
                ", weight=" + weight + " kg}";
    }
}
