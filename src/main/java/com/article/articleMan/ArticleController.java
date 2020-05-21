package com.article.articleMan;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping(path = "/api")
public class ArticleController {

	

	 @Autowired
	 ArticleRep AR;
	
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		return "Hicham BENHACHEM";
		
	}


	@GetMapping("/article")
	@ResponseBody
	public ResponseEntity<List<Article>> GetALL() {
		
		try {
			return new ResponseEntity<List<Article>>(AR.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			
			 return new ResponseEntity<List<Article>>( HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/article/{id}")
	@ResponseBody
	public ResponseEntity<Article> GetOn( @PathVariable("id") String id) {
		
//		System.out.println(id);
//		System.out.println(id);
//		System.out.println(id);
	
		try {
			return new ResponseEntity<Article>(AR.findById(id).get(),HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<Article>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@DeleteMapping("/article/{id}")
	@ResponseBody
	public ResponseEntity<Boolean> DeleteArticle( @PathVariable("id") String id) {
		
	
		try {
			AR.deleteById(id);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
		}
		
	}
	@PutMapping("/article/{id}")
	@ResponseBody
	public ResponseEntity<Article> UpdateArticle( @PathVariable("id") String id,@RequestBody Article a) {
		

	
		try {
			AR.deleteById(id);
			a.setId(id);
			AR.save(a);
			return new ResponseEntity<Article>(a,HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<Article>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PostMapping("/article")
	@ResponseBody
	public ResponseEntity<Article> CreateArticle( @RequestBody Article a){
//		System.out.println(a.toString());
		try {
			
			AR.save(a);
			return new ResponseEntity<Article>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<Article>(HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
	@DeleteMapping("/article")
	@ResponseBody
	public ResponseEntity<Boolean> DeleteAll( @RequestBody Article a){
//		System.out.println(a.toString());
		try {
			
			AR.save(a);
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
	
	
	

}
