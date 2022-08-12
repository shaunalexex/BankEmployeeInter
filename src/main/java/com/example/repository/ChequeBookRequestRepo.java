package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.AddOnCard;
import com.example.model.ChequeBookRequest;

@Repository
public interface ChequeBookRequestRepo extends JpaRepository<ChequeBookRequest, Integer>{

}
