public class MP3 extends Item{
  private String duration;
    MP3(String name, String description, String ID, float price, String duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("Duration: " + duration);
        System.out.println("Price: " + price);
    }
}
