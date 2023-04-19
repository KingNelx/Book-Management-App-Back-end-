package book.app.BookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book.app.BookApp.Model.Book;
import book.app.BookApp.Service.BookService;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/book")
@CrossOrigin(origins = "http://localhost:5173/")
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

    @GetMapping("/getBookByID/{id}")
    public Optional<Book> getBookByID(@PathVariable String id){
        return bookService.getBookByID(id);
    }

    @DeleteMapping("/deleteBookByID/{id}")
    public ResponseEntity<String>deleteBookByID(@PathVariable String id){
        return bookService.deleteBookByID(id);
    }
}
