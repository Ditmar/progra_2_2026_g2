package com;

public class Point3d extends  Point2d{
    private Double z;
    public Point3d(Double x, Double y, Double z) {
        super(x, y);
        this.z = z;
    }
    public Double getZ() {
        return z;
    }
    public void setZ(Double z) {
        this.z = z;
    }
    
}
