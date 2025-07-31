package collectionFrameworkLibrary.generics;

import java.util.List;
import java.util.Scanner;

public class LibraryInformation {

    private List<Book> arr;
    private Scanner sc;

    LibraryInformation(List<Book> b, Scanner sc) {
        this.arr = b;
        this.sc = sc;
    }

    public void add() { // ADD BOOK
        Book book = readDetails();
        arr.add(book);
    }

    public Book readDetails() {
        System.out.println("Enter SNo: ");
        int sno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Name : ");
        String name = sc.nextLine();
        // sc.nextLine();
        System.out.println("Enter Author Name : ");
        String author = sc.nextLine();
        return new Book(sno, name, author);
    }

    public void display() { // DISPLAY BOOKS
        System.out.println("SNO \t\t Name \t\t Author");
        System.out.println("-------------------------------------");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public void removeBook() { // REMOVING A BOOK
        System.out.println("Enter Book Name : ");
        String name = sc.nextLine();
        if (!arr.isEmpty()) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getName().equals(name)) {
                    arr.remove(i);
                    System.out.println("Removed Successfully..\n");
                    this.display();
                    return;
                }
            }
        } else {
            System.out.println("List is Empty. Cannot be deleted.");
            this.display();
        }
    }

    public void search() { // SEARCHING FOR A BOOK
        System.out.println("1. Search by Book Name :\t\t 2. Search by Author\n");
        int a = sc.nextInt();
        sc.nextLine();
        String temp;

        if (a == 1) {
            System.out.println("Enter Book Name : ");
            temp = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getName().equals(temp)) {
                    System.out.println("\n**Book Found**\n");
                    System.out.println(arr.get(i));
                    return;
                }
            }
            System.out.println("Book not found...");
        }
        if (a == 2) {
            System.out.println("Enter Author Name : ");
            temp = sc.nextLine();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getAuthor().equals(temp)) {
                    System.out.println("**Book Found**\n");
                    System.out.println(arr.get(i).toString());
                    return;
                }
            }
            System.out.println("Book not found...");
        } else {
            System.out.println("Wrong entry...");
        }
    }

}
