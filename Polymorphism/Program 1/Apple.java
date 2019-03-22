public class Apple extends Fruit {

    public Apple(String name, String taste, double size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("This is a red "+this.getName()+".");
        System.out.println("It is "+this.getTaste()+" in taste.");
        System.out.println("It is "+this.getSize()+" inches in diameter.");
    }
}
