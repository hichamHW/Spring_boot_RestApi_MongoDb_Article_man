package Services;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.article.articleMan.Article;
import com.article.articleMan.ArticleRep;

@Service
public class ArticleService implements ArticleOperation {

	
	@Override
	public void AddArticle(Article a) {
		
	
		
	}

//	@Override
//	public void DeleteArticle(String id) {
//		AR.deleteById(id);
//		
//	}
//
//	@Override
//	public Article GetArticle(String id) {
//		
//		return AR.findById(id).get();
//	}

	@Override
	public List<Article> ListArticle() {
		
		return null;
	}

}
