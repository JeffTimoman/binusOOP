package LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
        ArrayList<ListBook> theListBook = new ArrayList<>();
        Book viewBook = new Book();

        Scanner input = new Scanner(System.in);
        public int count;

        public void showBook(){
                System.out.println("===================L I S T   B O O K===================");
                System.out.println("|     Code     |     Title    |     Author    |  Qty  |");
                System.out.println("=======================================================");
                for (int i = 0; i < viewBook.bookCount; i++) {
                        System.out.println("| " + viewBook.bookCode);
                        System.out.print("| " + viewBook.bookTitle);
                        System.out.print("| " + viewBook.bookAuthor);
                        System.out.print("| " + viewBook.bookQty);
                        System.out.print(" |");
                }
                System.out.println("=======================================================");

                pressEnterKeyToContinue();
        }

        public int isAvailable(String sNo) {

                for (int i = 0; i < count; i++) {
                        if (sNo.equals(viewBook.theBook.get(i).bookCode)) {
                                if (viewBook.theBook.get(i).bookQtyCopy > 0) {

                                        System.out.println("Book is Available.");
                                        return i;
                                }
                                System.out.println("Book is Unavailable");
                                return -1;
                        }
                }
                System.out.println("No Book of Serial Number "
                        + " Available in Library.");
                return -1;
        }

        public Book checkOutBook(){
                System.out.println("Enter Serial No of Book to be Checked Out.");
                String sNo = input.nextLine();

                int bookIndex = isAvailable(sNo);

                if (bookIndex != -1){
                        viewBook.theBook.get(bookIndex).bookQtyCopy--;
                        return viewBook.theBook.get(bookIndex);
                }
                return null;
        }

        public void checkInBook(Book b){
                for (int i = 0; i < count; i++) {
                        if (b.equals(viewBook.theBook.get(i))){
                                viewBook.theBook.get(i).bookQtyCopy++;
                                return;
                        }
                }
        }

        public void pressEnterKeyToContinue()
        {
                System.out.println("Press Enter key to continue...");
                Scanner s = new Scanner(System.in);
                s.nextLine();
        }
}
