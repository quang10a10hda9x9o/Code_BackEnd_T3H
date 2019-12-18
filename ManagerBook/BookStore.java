package ManagerBook;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private static String name = " T3H Book Store";
    private List<Book> bookList;

    public BookStore(List<Book> bookList) {
        this.bookList = bookList;
    }

    //Add Book
    public List<Book> addBook(Book book) {
        this.bookList.add(book);
        return this.bookList;
    }

    //Xoa book
    public List<Book> removeBook(Book book) {
        this.bookList.remove(book);
        return this.bookList;
    }

    //Sua Book
    public List<Book> setBook(Book book) {
        this.bookList.set(book);
        return this.bookList;
    }

    //Search book theo author
    public List<Book> findBookByAuthor(String nameAuthor) {
        List<Book> listSearch = new ArrayList<>();
        for (Book  b : this.bookList) {
            if(b.getAuthor().equals(nameAuthor)) {
                listSearch.add(b);
            }
        }
        return listSearch;
    }

    public void printListBook() {
        for(Book b : this.bookList){
            System.out.println(this.bookList);
        }
    }
}
