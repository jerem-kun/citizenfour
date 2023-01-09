package Activity375;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Library library = new Library();
        ArrayList<Book> childrensBooks = new ArrayList<Book>();
        childrensBooks = library.getChildrensBooks();
        String authorToFind = "L. Frank Baum";
        String bookToFind = "Sky Island";
        double minimumRating = 0.0;

        for(Book find : childrensBooks){
            if (authorToFind.equals(find.getAuthor())){
                System.out.println(find.getTitle());
            }
        }

        System.out.println("\n");

        for(Book find : childrensBooks){
            if (bookToFind.equals(find.getTitle())){
                minimumRating = find.getRating(); 
            }
        }
        
        for(Book find : childrensBooks){
            if (find.getRating() >= minimumRating){
                System.out.println(find.getTitle() + ", " + find.getAuthor());
            }
        }
    }
}