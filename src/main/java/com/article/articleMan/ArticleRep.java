package com.article.articleMan;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public interface ArticleRep extends MongoRepository<Article, String> {
	

}
