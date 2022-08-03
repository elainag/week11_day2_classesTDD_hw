import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private int stock;

    private ArrayList<Books> inventory;

    public Library(int stock){
        this.stock = stock;
        this.inventory = new ArrayList<>();
    }

    public int countStock(){
        return inventory.size();
    }
    public void addBook(Books books){
        var maxStock = 5;
        if (countStock() < maxStock){
            inventory.add(books);
        }
    }

}
