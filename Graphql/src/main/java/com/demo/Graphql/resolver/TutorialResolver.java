package com.demo.Graphql.resolver;


import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demo.Graphql.Repository.AuthorRepository;
import com.demo.Graphql.model.Author;
import com.demo.Graphql.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;

    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }
}