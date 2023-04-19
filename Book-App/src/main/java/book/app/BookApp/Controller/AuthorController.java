package book.app.BookApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PutMapping("/updateAchievementsByID/{id}/achievements")
    public ResponseEntity<Author> updateAchievementsByID(@PathVariable String id, @RequestBody List <String> newAchievements){
        return authorService.updateAchievements(id, newAchievements);
    }

    @PutMapping("/updateAwardsById/{id}/awards")
    public ResponseEntity<Author> updateAwardsByID(@PathVariable String id, @RequestBody List <String> newAwards){
        return authorService.updateAwards(id, newAwards);
    }

    @PutMapping("/updateHonorsByID/{id}/honors")
    public ResponseEntity<Author> updateHonorsByID(@PathVariable String id, @RequestBody List <String> newHonors){
        return authorService.updateHonors(id, newHonors);
    }
}
