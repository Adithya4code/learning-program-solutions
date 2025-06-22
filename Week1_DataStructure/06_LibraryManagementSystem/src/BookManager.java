import java.util.Arrays;

public class BookManager {
    private Book[] books;
    private int count;

    public BookManager(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if(count < books.length)
            books[count++] = book;
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public Book linearSearch(String title) {
        for (int i = 0; i < count; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title))
                return books[i];
        }
        return null;
    }

    public Book binarySearch(String title) {
        Arrays.sort(books, 0, count);
        int low = 0, high = count - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if(cmp == 0)
                return books[mid];
            else if(cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
}
