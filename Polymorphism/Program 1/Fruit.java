public class Fruit {
    String name;
    String taste;
    double size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Fruit(String name, String taste, double size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    public Fruit(){

    }

    public void eat(){
        System.out.println("Fruit's Name = "+this.getName());
        System.out.println("Taste = "+this.getTaste());
    }
}
