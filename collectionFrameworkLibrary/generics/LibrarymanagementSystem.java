package collectionFrameworkLibrary.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarymanagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<Book>();
        Scanner sc = new Scanner(System.in);
        LibraryInformation lb = new LibraryInformation(arr, sc);
        
   
        while (true) {
            System.out.println(" 1. Add Book  2.Remove Book  3.Display Books  4.Search Book  5.Exit \n");
            System.out.println("Enter your Choice : ");
            int temp = sc.nextInt();
            sc.nextLine();

            switch (temp) {
                case 1:
                    lb.add();
                    break;
                case 2:
                    lb.removeBook();
                    break;
                case 3:
                    lb.display();
                    break;
                case 4:
                    lb.search();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
