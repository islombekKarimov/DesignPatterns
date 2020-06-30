package test.designPattern.creational.prototype;

/**
 * Created by Islombek Karimov on 16.06.2020.
 */
public abstract class Shape implements Cloneable {
    private String id;
    private String type;

    abstract void drow();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
