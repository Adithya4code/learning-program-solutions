public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager(10);
        manager.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        manager.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        manager.addBook(new Book(3, "Effective Java", "Joshua Bloch"));

        System.out.println("All Books:");
        manager.displayBooks();

        System.out.println("\nLinear Search: Clean Code");
        Book result1 = manager.linearSearch("Clean Code");
        System.out.println(result1 != null ? result1 : "Not found");

        System.out.println("\nBinary Search: Effective Java");
        Book result2 = manager.binarySearch("Effective Java");
        System.out.println(result2 != null ? result2 : "Not found");
    }
}
