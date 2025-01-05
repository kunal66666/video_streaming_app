package com.mscoder.service_registery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mscoder.service_registery.model.MovieInfo;
import com.mscoder.service_registery.model.MovieInfoRespository;

@RestController
public class MovieRestController {

	@Autowired
	private MovieInfoRespository repo;

	
	  @PostMapping("/movie-info/save")
	    public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList) {
	        return repo.saveAll(movieInfoList);
	    }

	    @GetMapping("/movie-info/list")
	    public List<MovieInfo> getAll() {
	        return repo.findAll();
	    }

	    @GetMapping("/movie-info/find-path-by-id/{movieInfoId}")
	    public String findPathById(@PathVariable Long movieInfoId) {
	        var videoInfoOptional = repo.findById(movieInfoId);
	        return videoInfoOptional.map(MovieInfo::getPath).orElse(null);
	    }
	
}
