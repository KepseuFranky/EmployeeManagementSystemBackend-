package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Stagiaire;
import com.example.demo.repository.StagiaireRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v2/")
public class StagiaireController {

	@Autowired
	private StagiaireRepository stagiaireRepository;
	
	// get all stagiaires
	@GetMapping("/stagiaires")
	public List<Stagiaire> getAllStagiaires(){
		return stagiaireRepository.findAll();
	}	
	
}

