package book.app.BookApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/getAuthorByID/{id}")
    public Optional <Author> getAuthorByID(@PathVariable String id){
        return authorService.getAuthorByID(id);
    }

    @DeleteMapping("/deleteAuthorByID/{id}")
    public String deleteAuthorByID(@PathVariable String id){
        return authorService.deleteAuthorByID(id);
    }
}
