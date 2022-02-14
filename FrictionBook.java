public class FrictionBook extends Book{
    private String category;

    public FrictionBook() {
    }

    public FrictionBook(String id, String name, String author, double price, String category) {
        super(id, name, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
