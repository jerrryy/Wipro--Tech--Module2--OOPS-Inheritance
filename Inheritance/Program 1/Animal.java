class Animal {
    public Animal() {
        System.out.println("A new animal has been created!");
    }
     
    public void sleep() {
        System.out.println("An animal sleeps...");
    }
     
    public void eat() {
        System.out.println("An animal eats...");
    }
}
class Bird extends Animal {
    public Bird() {
        super();
        System.out.println("A new bird has been created!");
    }
     
    public void sleep() {
        System.out.println("A bird sleeps...");
    }
     
    public void eat() {
        System.out.println("A bird eats...");
    }
	
	public void fly(){
		System.out.println("A bird flies...");
	}
}

class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
         
        System.out.println();
         
        animal.sleep();
        animal.eat();
         
        bird.sleep();
        bird.eat();
        bird.fly();
    }
}