public class Item {
  String name;
    private String description;
    protected String ID;
    float price;

    Item(String name, String description, String ID, float price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    void showInfo() {}
}
