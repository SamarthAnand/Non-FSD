package OopsConcept.Library;

public class Library {
    String bookName;
    String authorName;
    int copies;

    @Override
    public String toString() {
        return "Library{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", copies=" + copies +
                '}';
    }

    public Library(String bookName, String authorName, int copies) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.copies = copies;
    }
}
