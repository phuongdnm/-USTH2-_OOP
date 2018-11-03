public class VectorTestDrive {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.setXY(5,3);
        Vector v2 = new Vector();
        v2.setXY(4,2);

        v1.add(v2);
        v1.subtract(v2);
        v1.multiply(v2);
    }
}

class Vector{
    private int x;
    private int y;

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void add(Vector other){
        System.out.println("Sum: ("+ (this.x + other.x) + ";" + (this.y + other.y) +")");
    }
    public void subtract(Vector other){
        System.out.println("Subtract: (" + (this.x - other.x) + ";" + (this.y -other.y) + ")");
    }
    public void multiply(Vector other){
        System.out.println("Multiply: " + (this.x * other.x + this.y * other.y));
    }
}