public class Test {

        public static void main(String[] args) {

            Shape shape = new Shape();
            Shape c = new Circle();
            Shape t = new Triangle();
            Shape s = new Square();

            shape.draw();
            shape.erase();

            System.out.println("-------------------");

            c.draw();
            c.erase();

            System.out.println("-------------------");

            t.draw();
            t.erase();

            System.out.println("-------------------");

            s.draw();
            s.erase();


        }

}
