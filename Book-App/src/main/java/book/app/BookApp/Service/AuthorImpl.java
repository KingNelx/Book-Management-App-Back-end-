package book.app.BookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import book.app.BookApp.Model.Author;
import book.app.BookApp.Repository.AuthorRepo;

@Service
public class AuthorImpl implements AuthorService {
    
    @Autowired
    private AuthorRepo authorRepo;

    @Override
    public List <Author> getAuthors(){
        if(authorRepo.findAll().isEmpty()){
            throw new HttpClientErrorException(HttpStatus.NO_CONTENT);
        }
        return authorRepo.findAll();
    }

    @Override
    public Optional <Author> getAuthorByID(String id){
        if(!authorRepo.findById(id).isPresent()){
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        return authorRepo.findById(id);
    }

    @Override
    public String deleteAuthorByID(String id){
        if(!authorRepo.findById(id).isPresent()){
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }

        authorRepo.deleteById(id);
        return "Author with ID: " + id + " has been DELETED ";
    }

    @Override
    public ResponseEntity <Author> updateAchievements(String id, List <String> newAchievements){
        Optional <Author> authorHandler = authorRepo.findById(id);
        if(authorHandler.isPresent()){
            Author author = authorHandler.get();
            author.setAchievements(newAchievements);
            authorRepo.save(author);
            return ResponseEntity.ok(author);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity <Author> updateAwards(String id, List <String> newAwards){
        Optional <Author> authorHandler = authorRepo.findById(id);
        if(authorHandler.isPresent()){
            Author author = authorHandler.get();
            author.setAchievements(newAwards);
            authorRepo.save(author);
            return ResponseEntity.ok(author);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity <Author> updateHonors(String id, List <String> newHonors){
        Optional <Author> authorHandler = authorRepo.findById(id);
        if(authorHandler.isPresent()){
            Author author = authorHandler.get();
            author.setHonors(newHonors);
            authorRepo.save(author);
            return ResponseEntity.ok(author);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}