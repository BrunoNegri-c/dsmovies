package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.Moviedto;
import com.devsuperior.dsmovie.entities.Movies;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;

	@Transactional(readOnly = true)
	public Page<Moviedto>findAll(Pageable pageable) {
		Page<Movies> result = repository.findAll(pageable);
		Page<Moviedto> page = result.map(x -> new Moviedto(x));
		return page;
	}
	@Transactional(readOnly = true)
	public Moviedto findById(Long id) {
		Movies result = repository.findById(id).get();
		Moviedto dto = new Moviedto(result);
		return dto;
	}
}
