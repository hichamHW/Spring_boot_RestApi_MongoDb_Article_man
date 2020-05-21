package com.article.articleMan;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document
public class Article {
	
	 @Id 
	 private String id; 
	 private String title; 
	 private String author;
	 private String text; 
	 private String image;
	  
	
	  public String getId() { return id; } 
	  public void setId(String id) {
	  this.id = id; }
	  public String getTitle() { return title; } public void
	  setTitle(String title) { this.title = title; } public String getAuthor() {
	  return author; } public void setAuthor(String author) { this.author = author;
	  } public String getText() { return text; } public void setText(String text) {
	  this.text = text; } public String getImage() { return image; } public void
	  setImage(String image) { this.image = image; }
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", author=" + author + ", text=" + text + ", image=" + image
				+ "]";
	}
	  
	 
	
}
