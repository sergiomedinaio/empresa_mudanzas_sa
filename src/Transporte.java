import java.util.ArrayList;

public class Transporte {
    private ArrayList<Transportable> transportables;
    private Dimension dimension;
    private double capacity;
    private double maxCapacity;
    private int maxItemCounter;

    public Transporte(ArrayList<Transportable> transportables, Dimension dimension, double capacity, double maxCapacity, int maxItemCounter) {
        this.transportables = transportables;
        this.dimension = dimension;
        this.capacity = capacity;
        this.maxCapacity = maxCapacity;
        this.maxItemCounter = maxItemCounter;
    }

    public Transporte(Dimension dimension, double maxCapacity, int maxItemCounter) {
        this.dimension = dimension;
        this.maxCapacity = maxCapacity;
        this.maxItemCounter = maxItemCounter;
        setTransportables(new ArrayList<Transportable>());
        setCapacity(0);
    }

    public ArrayList<Transportable> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<Transportable> transportables) {
        this.transportables = transportables;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxItemCounter() {
        return maxItemCounter;
    }

    public void setMaxItemCounter(int maxItemCounter) {
        this.maxItemCounter = maxItemCounter;
    }

    public void load(Transportable transportable) {
        if(getTransportables().size() >= getMaxItemCounter()) return;
        if (getCapacity() + transportable.getWeight() > getMaxCapacity()) return;
        getTransportables().add(transportable);
        setCapacity(getCapacity() + transportable.getWeight());
    }

    public String generateBillList() {
        String bill = "";
        for (int i = 0; i < transportables.size(); i++) {
            String name = getTransportables().get(i).getName();
            double weight = getTransportables().get(i).getWeight();
            bill += name + " ("+ weight + "Kg.)\n";
        }
        bill += "Total weight: " + getCapacity() + " Kg";
        return bill;
    }
}
