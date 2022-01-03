package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Stagiaire;



@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire, Long>{

}