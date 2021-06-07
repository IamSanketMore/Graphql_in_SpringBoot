package com.demo.Graphql.Repository;

import com.demo.Graphql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long>
{

}
