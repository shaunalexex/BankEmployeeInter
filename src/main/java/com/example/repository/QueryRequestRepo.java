package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.QueryRequest;

@Repository
public interface QueryRequestRepo extends JpaRepository<QueryRequest, Integer>{

	@Query("select e from QueryRequest e where e.status=:status")
	List<QueryRequest> findQueriesByStatus(@Param("status") String status);
	
	

}
