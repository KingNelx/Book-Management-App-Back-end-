package book.app.BookApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.app.BookApp.Repository.AuthorRepo;

@Service
public class AuthorImpl implements AuthorService {
    
    @Autowired
    private AuthorRepo authorRepo;

}
