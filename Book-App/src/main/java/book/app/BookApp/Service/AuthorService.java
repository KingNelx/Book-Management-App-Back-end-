package book.app.BookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import book.app.BookApp.Model.Author;

@Service
public interface AuthorService {

    // get all authors
    List<Author> getAuthors();

    // get author by id
    Optional<Author> getAuthorByID(String id);

    // delete author by id
    String deleteAuthorByID(String id);

    // update author achievements
    ResponseEntity<Author> updateAchievements(String id, List<String> newAchievements);

    // update author awards
    ResponseEntity <Author> updateAwards (String id, List <String> newAwards);

    // update author honors
    ResponseEntity<Author> updateHonors(String id, List<String> newHonors);
}
