package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Book;
import sv.edu.udb.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }
}