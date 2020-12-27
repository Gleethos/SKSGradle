package org.sks.project.entities;


import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/resources/news")
@Log
public class BlogResource {
    //@Autowired
    //private BlogPostRepository newsRepository;

    // TODO add more methods

    @GetMapping
    public List<BlogPost> retrieveAll( ) {
        //log.info("retrieveAll() >> optCategoryId=" + optCategoryId);

//		return optCategoryId
//			.map(categoryId -> newsRepository.findAllByCategoryId(categoryId))
//			.orElse(newsRepository.findAll());
        return new ArrayList<>();//newsRepository.findAll();
        //if (optCategoryId.isPresent()) {
        //
        //}
        //else {
        //    return newsRepository.findAll();
        //}
    }
}