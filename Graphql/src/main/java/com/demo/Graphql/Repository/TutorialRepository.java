package com.demo.Graphql.Repository;

import com.demo.Graphql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>
{
}
