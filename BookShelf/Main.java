package BookShelf;

public class Main {
    public static void main(String[] args) {
        BookShelf listOfBooks = new BookShelf();
        listOfBooks.addBook("Sapiens");
        listOfBooks.addBook("1984");
        listOfBooks.addBook("Animal Farm");
        listOfBooks.addBook("Bitcoin Standard");
        listOfBooks.addBook("Fiat Standard");

        System.out.println(listOfBooks.size());
        System.out.println(listOfBooks.remove());
        System.out.println(listOfBooks.size());
    }
}
