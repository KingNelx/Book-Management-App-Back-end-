package book.app.BookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import book.app.BookApp.Model.Author;

@Service
public interface AuthorService { 
    
    // get all authors
    List <Author> getAllAuthors();

    // get author by id
    Optional <Author> getAuthorByID(String id);
}
