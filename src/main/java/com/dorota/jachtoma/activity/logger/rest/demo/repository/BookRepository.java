package com.dorota.jachtoma.activity.logger.rest.demo.repository;

import com.dorota.jachtoma.activity.logger.rest.demo.model.Book;
import com.dorota.jachtoma.activity.logger.rest.demo.model.Author;
import com.dorota.jachtoma.activity.logger.rest.demo.model.BookType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

    List<Book> findByTitle(@Param("title") String title);

    List<Book> findByAuthor(@Param("author") Author author);

    List<Book> findByType(@Param("type")BookType type);
}
