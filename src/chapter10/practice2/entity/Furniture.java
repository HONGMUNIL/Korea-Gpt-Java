package chapter10.practice2.entity;


public class Furniture extends Item {
    private String material; //재질
    private String size; //크기

    public Furniture(String id, String name, int price, int quantity, String material, String size) {
        super(id, name, price, quantity);
        this.material = material;
        this.size = size;

    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }

    public String toString() {
        return super.toString() + "// Material: " + material + " size: " + size;
    }


}
