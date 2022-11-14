public class Transportable {

    private Dimension dimension;
    private String name;
    private double weight;
    private boolean fragile;

    public Transportable(Dimension dimension, String name, double weight, boolean fragile) {
        this.dimension = dimension;
        this.name = name;
        this.weight = weight;
        this.fragile = fragile;
    }

    public Transportable(Dimension dimension, String name, double weight) {
        this.dimension = dimension;
        this.name = name;
        this.weight = weight;
        setFragile(false);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }
}
