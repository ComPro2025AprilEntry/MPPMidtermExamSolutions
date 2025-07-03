package BookShelf;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<String> list;

    public BookShelf() {
        list = new ArrayList<>();
    }

    public void addBook(String book) {
        list.add(book);
    }

    public String remove() {
        String top = list.getLast();
        list.removeLast();
        return top;
    }

    public int size() {
        return list.size();
    }
}
