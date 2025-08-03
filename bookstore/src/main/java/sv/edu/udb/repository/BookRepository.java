package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.model.Book;

import java.util.List;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
}