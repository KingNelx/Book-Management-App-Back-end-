package book.app.BookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
