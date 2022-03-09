package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movies;

public class Moviedto {
	private long id;
	private String title;
	private double score;
	private Integer count;
	private String Image;
	
	public Moviedto() {
		
	}

	public Moviedto(long id, String title, double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		Image = image;
	}
	public Moviedto(Movies movies) {
		id = movies.getId();
		title = movies.getTitle();
		score = movies.getScore();
		count = movies.getCount();
		Image = movies.getImage();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
	

}
