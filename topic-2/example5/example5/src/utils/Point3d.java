package utils;

public class Point3d extends Point {
    private Integer z;

    public Point3d(Integer x, Integer y, Integer z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void print() {
        System.out.println("[ " + this.getX() + ", " + this.getY() + ", " + this.z + "]");
    }

}
