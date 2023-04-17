package book.app.BookApp.Service;
import book.app.BookApp.Model.Author;
import book.app.BookApp.Model.Book;
import book.app.BookApp.Model.Reviews;
import book.app.BookApp.Repository.AuthorRepo;
import book.app.BookApp.Repository.BookRepo;
import book.app.BookApp.Repository.ReviewRepo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class BookImpl implements BookService {

  @Autowired
  private BookRepo bookRepo;

  @Autowired
  private AuthorRepo authorRepo;

  @Autowired
  private ReviewRepo reviewRepo;

  @Override
  public List<Book> getAllBooks() {
    if(bookRepo.findAll().isEmpty()){
        throw new HttpClientErrorException(HttpStatus.NO_CONTENT);
    }
    return bookRepo.findAll();
  }

  @Override
  public ResponseEntity<String> addBook(Book addBook) {
    Author author = addBook.getAuthor();
    Reviews reviews = addBook.getReviews();

    if (author == null || author.getId() == null) {
      throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
    } else if (reviews == null || reviews.getId() == null) {
      throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
    }
        bookRepo.save(addBook);
        authorRepo.save(author);
        reviewRepo.save(reviews);
        return ResponseEntity.ok("SAVED");
  } 
}
