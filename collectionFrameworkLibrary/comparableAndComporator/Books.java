package collectionFrameworkLibrary.comparableAndComporator;

import java.util.Comparator;

public class Books implements Comparator<Books>{
    private int sNo;
    private String name;
    private String author;

    Books(){

    }

    Books(int sNo, String name, String author) {
        this.author = author;
        this.name = name;
        this.sNo = sNo;
    }

    public int getSNo() {
        return this.sNo;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setSNo(int sNo) {
        this.sNo = sNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // public String toString() {
    //     return this.sNo + " \t\t " + this.name + " \t\t " + this.author;
    // }
    public String toString() {
        return String.format("%-5s%-15s%-15s", this.sNo, this.name, this.author);
    }

    public int compare(Books b1, Books b2){
        // return ((Integer) b2.sNo).compareTo(b1.sNo);        // Desc based on SNO
        // return ((Integer) b1.sNo).compareTo(b2.sNo);     // Asc based on Sno
        // return (b1.name).compareTo(b2.name);     // Asc based on Name
        return (b1.author).compareTo(b2.author);     // Asc based on Author
    }
}
