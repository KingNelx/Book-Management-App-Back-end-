package book.app.BookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import book.app.BookApp.Model.Reviews;

@Service
public interface ReviewService {
    
    // get all reviews

    List <Reviews> getAllReviews();

    // get reviews by id

    Optional <Reviews> getReviewsByID(String id);
}
