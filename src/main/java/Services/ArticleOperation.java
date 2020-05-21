package Services;

import java.util.List;

import org.bson.types.ObjectId;

import com.article.articleMan.Article;

public interface ArticleOperation {
	
	void AddArticle(Article a ) ;
//	void DeleteArticle(ObjectId id);
//	Article GetArticle(ObjectId id);
	List<Article> ListArticle();

}
