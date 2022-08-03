import java.util.ArrayList;

public class Borrower {

    private String name;

       private ArrayList<Books> onLoan;

        public Borrower(String name){
            this.name = name;
            this.onLoan = new ArrayList<>();
        }

        public String getName() {
            return name;
        }
        public int currentlyOnLoan(){
            return onLoan.size();
        }
        public int checkedOutBooks(Books book){
           onLoan.add(book);
           return onLoan.size();
        }



}
