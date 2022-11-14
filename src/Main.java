public class Main {
    public static void main(String[] args) {
        Transportable chair = new Transportable(
            new Dimension(0.4,1.2,0.4),
            "Fragile chair",
            2.0,
            true
        );
        Transportable matalChair = new Transportable(
                new Dimension(0.4,1.2,0.4),
                "Metal chair",
                4.0,
                false
        );
        Transportable oldTv = new Transportable(
                new Dimension(1.4,1.2,0.6),
                "Old TV",
                4.0,
                false
        );
        Transportable newTv = new Transportable(
                new Dimension(1.4,1.2,0.1),
                "New TV",
                3.0,
                true
        );

        Transportable myTv = new Transportable(
                new Dimension(1.0,0.6,0.2),
                "My TV",
                2.5,
                false
        );


    }
}
