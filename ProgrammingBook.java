public class ProgrammingBook extends Book{
    private String language;
    private String frameWork;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String id, String name, String author, double price, String language, String frameWork) {
        super(id, name, author, price);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }
}
