public class Orange extends Fruit {

    public Orange(String name, String taste, double size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("This is a round "+this.getName()+".");
        System.out.println("It is "+this.getTaste()+" in taste.");
        System.out.println("It is "+this.getSize()+" inches in diameter.");
    }
}
