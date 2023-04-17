package book.app.BookApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.app.BookApp.Model.Book;

@Service
public interface BookService {
    
    // get all books
    List <Book> getAllBooks();
    
}
