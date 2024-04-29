package com.project1.day13bidironetomany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day13bidironetomany.Model.Book;
import com.project1.day13bidironetomany.Service.BookService;

@RestController
public class BookController 
{
    @Autowired
    BookService BS;

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<Book> postdata(@RequestBody Book B,@PathVariable int authorId)
    {
        try{
            return new ResponseEntity<>(BS.postdata(B, authorId),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteById(@PathVariable int bookId)
    {
        try{
            BS.deleteBook(bookId);
            return new ResponseEntity<>("Book Deleted SuccessFully!",HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>("Book Not Found with ID: "+bookId,HttpStatus.NOT_FOUND);
        }
    }

}
