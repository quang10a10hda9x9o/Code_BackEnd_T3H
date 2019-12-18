package ManagerBook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        BookStore store = new BookStore(list);

        Author namCao = new Author("Nam Cao", 80, "Việt Nam");
        Book book1 = new Book("Lão Hạc",1,100000.00f,namCao);
        Book book2 = new Book("Tắt Đèn", 2, 150000.00f,
                new Author("Nguyễn Tất Tố",80,"Hà Nội"));//Tạo tắt
        Book book3 = new Book("Truyện Kiều", 3,500000.00f,
                new Author("Nguyễn Du",70,"Cao Bằng"));
        Book book4 = new Book("Nam Cao",4,200000.00f,namCao);
        store.addBook(book1);
        store.addBook(book2);
        store.addBook(book3);
        store.addBook(book4);

        store.printListBook();
    }
}
