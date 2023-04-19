package book.app.BookApp.Controller;

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

import book.app.BookApp.Model.Reviews;
import book.app.BookApp.Service.ReviewService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:5173/")
public class ReviewController {
    
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/getAllReviews")
    public List <Reviews> getAllReviews(){
        return reviewService.getAllReviews();
    }    

    @GetMapping("/getReviewsByID/{id}")
    public Optional <Reviews> getReviewsByID(@PathVariable String id){
        return reviewService.getReviewsByID(id);
    }

    @DeleteMapping("/deleteReviewsByID/{id}")
    public ResponseEntity <String> deleteReviewsByID(@PathVariable String id){
        return reviewService.deleteReviewsByID(id);
    }

    @PutMapping("/updateReviewsByID/{id}/comments")
    public ResponseEntity <Reviews> updateCommentReviews(@PathVariable String id, @RequestBody List <String> newComments){
        return reviewService.updateCommentReviews(id, newComments);
    }
    
}
