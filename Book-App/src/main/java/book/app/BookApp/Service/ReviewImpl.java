package book.app.BookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import book.app.BookApp.Model.Reviews;
import book.app.BookApp.Repository.ReviewRepo;

@Service
public class ReviewImpl implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    @Override
    public List <Reviews> getAllReviews(){
        if(reviewRepo.findAll().isEmpty()){
            throw new HttpClientErrorException(HttpStatus.NO_CONTENT);
        }
        return reviewRepo.findAll();
    }

    @Override
    public  Optional <Reviews> getReviewsByID(String id){
        if(!reviewRepo.findById(id).isPresent()){
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        return reviewRepo.findById(id);
    }

    @Override
    public ResponseEntity <String> deleteReviewsByID(String id){
        if(!reviewRepo.findById(id).isPresent()){
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }

        reviewRepo.deleteById(id);
        return ResponseEntity.ok("Reviews with ID: " + id + " has been DELETED ");
    }


    @Override
    public ResponseEntity <Reviews> updateCommentReviews(String id, List <String> comments){
        Optional <Reviews> reviewHandler = reviewRepo.findById(id);
        if(reviewHandler.isPresent()){
            Reviews reviews = reviewHandler.get();
            reviews.setComments(comments);
            reviewRepo.save(reviews);
            return ResponseEntity.ok(reviews);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
