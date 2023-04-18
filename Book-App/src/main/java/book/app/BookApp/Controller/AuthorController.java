package book.app.BookApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import book.app.BookApp.Model.Author;
import book.app.BookApp.Service.AuthorService;

@RestController
@RequestMapping("/api/author")
@CrossOrigin(origins = "http://localhost:5173/")
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;

    @GetMapping("/getAuthors")
    public List <Author> getAllAuthors(){
        return authorService.getAuthors();
    }
}
