package com.dorota.jachtoma.activity.logger.rest.demo.repository;

import com.dorota.jachtoma.activity.logger.rest.demo.model.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

    List<Author> findByLastName(@Param("lastName") String lastName);

    List<Author> findByFirstName(@Param("firstName") String firstName);
}
