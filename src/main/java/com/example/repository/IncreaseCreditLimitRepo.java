package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.IncreaseCreditLimit;

@Repository
public interface IncreaseCreditLimitRepo extends JpaRepository<IncreaseCreditLimit,Integer> {

}
