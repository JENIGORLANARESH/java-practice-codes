package collectionFrameworkLibrary.generics;

public class Book implements Comparable<Book>{
    private int sNo;
    private String name;
    private String author;
    
    public Book(int sNo, String name, String author){
        this.author = author;
        this.name = name;
        this.sNo = sNo;
    }

    public int getSNo(){
        return this.sNo;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setSNo(int sNo){
        this.sNo = sNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String toString(){
        return this.sNo+" \t\t "+ this.name+" \t\t "+this.author;
    }

    //***** */
    //  To check whether two objects are equal or not java checks HashCode not data inside object.
    // So to check both equal or not based on data inside object we should override hashCode and equals method.
    // Note : We should override both. Only one cannot be overriden.

    // @Override
    // public int hashCode(){
    //     return sNo;
    // }

    // @Override
    // public boolean equals(Object obj){
    //     return this.sNo == ((Book)obj).sNo;
    // }
    
    @Override
    public int compareTo(Book b){
        return Integer.compare(this.sNo, b.sNo);
    }

    // In order to use instances of Book in a TreeSet, the elements must be
    // comparable so that the TreeSet can maintain its elements in sorted order.
}

