public class Book {
   
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   public String getName() {
      return name;
   }
   public Author getAuthor() {
      return author; 
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public int getQty() {
      return qty;
   }
   public void setQty(int qty) {
      this.qty = qty;
   }
 
   public String toString() {
      return "'" + name + "' by " + author;  
   }
   public static void main(String[] args) {
      Author as = new Author("F.R.I.E.N.D.S", "joeytribbiani@pizza.com", 'm');
      System.out.println(as);

      Book dummyBook = new Book("Harry Potter", as, 9.99, 99);
      System.out.println(dummyBook); 

      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      System.out.println(dummyBook); 
      System.out.println("Name is: " + dummyBook.getName());
      System.out.println("Price is: " + dummyBook.getPrice());
      System.out.println("Quantity is: " + dummyBook.getQty());
      System.out.println("Author is: " + dummyBook.getAuthor());  
      System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
      System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
      System.out.println("Author's gender is: " + dummyBook.getAuthor().getGender());

      Book moreDummyBook = new Book("Game of Thrones",
            new Author("George R. R. Martin", "martin@nowhere.com", 'm'), 
            19.99, 8);
      System.out.println(moreDummyBook);  
   }
}