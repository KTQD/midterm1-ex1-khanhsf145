public class Book extends Item{
  private String author, genre;
    private int numberOfPage;
    Book(String name, String description, String ID, float price, String author, String genre, int numberOfPage) {
        super(name, description, ID, price);
        this.author = author;
        this.genre = genre;
        this.numberOfPage = numberOfPage;
    }

    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Discription: " + getDescription());
        System.out.println("Number of page: " + numberOfPage);
        System.out.println("Price: " + price);
    }
}
