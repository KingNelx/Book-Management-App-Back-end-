package book.app.BookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book.app.BookApp.Model.Book;
import book.app.BookApp.Service.BookService;
import java.util.List;
@RestController
@RequestMapping("/api/book")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public List <Book> gettAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/addBooks")
    public ResponseEntity <String> addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }
}
