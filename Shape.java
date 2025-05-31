package PabrikDonat.uap.bases;

public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void printInfo();
}
