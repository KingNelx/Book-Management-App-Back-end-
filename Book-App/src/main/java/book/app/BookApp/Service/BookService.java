package book.app.BookApp.Service;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import book.app.BookApp.Model.Book;

@Service
public interface BookService {
    
    // get all books
    List <Book> getAllBooks();

    // add books
    ResponseEntity<String> addBook(Book addBook);

    // // get book by ID
    // Optional<Book> getBookByID(String id);

    // // delete book byID
    // String deleteBookByID(String id);
    
}
