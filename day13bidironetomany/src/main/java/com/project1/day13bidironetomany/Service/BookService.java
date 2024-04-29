package com.project1.day13bidironetomany.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day13bidironetomany.Model.Author;
import com.project1.day13bidironetomany.Model.Book;
import com.project1.day13bidironetomany.Repository.BookRepo;

@Service
public class BookService 
{
    @Autowired
    BookRepo BR;
    
    @Autowired
    AuthorService AS;

    public Book postdata(Book B,int id)
    {
        Author A=AS.getById(id);
        B.setAuthor(A);
        List<Book> B1=A.getBooks();
        B1.add(B);
        A.setBooks(B1);
        AS.postdata(A);
        return B;
    }

    public void deleteBook(int id)
    {
        BR.deleteById(id);
    }
}
