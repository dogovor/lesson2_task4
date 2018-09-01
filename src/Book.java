public class Book {
    private String name;
    private String author;
    private String publishing;
    private int publishYear;
    private int qntPages;
    private double price;
    private String tBinding;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setQntPages(int qntPages) {
        this.qntPages = qntPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void settBinding(String tBinding) {
        this.tBinding = tBinding;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getQntPages() {
        return qntPages;
    }

    public double getPrice() {
        return price;
    }

    public String gettBinding() {
        return tBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", qntPages=" + qntPages +
                ", price=" + price +
                ", tBinding='" + tBinding + '\'' +
                '}';
    }
}
