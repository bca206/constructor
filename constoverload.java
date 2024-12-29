public class constoverload {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 30);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of Box1: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of Box2: " + vol);

        vol = mybox3.volume();
        System.out.println("Volume of Box3: " + vol);
    }
}

class Box {
    double width, height, depth;

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor
    Box() {
        width = height = depth = 0;
    }

    // Constructor with one parameter
    Box(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}
