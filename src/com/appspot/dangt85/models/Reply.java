package com.appspot.dangt85.models;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Reply {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key id;

	@Persistent
	private String repliedBy;

	@Persistent
	private String content;

	@Persistent
	private Date createdAt;

	@Persistent
	private Post post;

	public Reply() {
		this.createdAt = new Date();
	}

	public Reply(String repliedBy, String content, Date createdAt) {
		this.repliedBy = repliedBy;
		this.content = content;
		this.createdAt = createdAt;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}

	public String getRepliedBy() {
		return repliedBy;
	}

	public void setRepliedBy(String repliedBy) {
		this.repliedBy = repliedBy;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
