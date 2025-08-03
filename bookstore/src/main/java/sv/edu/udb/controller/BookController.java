package sv.edu.udb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.model.Book;
import sv.edu.udb.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title) {
        return bookService.searchBooksByTitle(title);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
