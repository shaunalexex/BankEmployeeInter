package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.AddOnCard;
import com.example.model.ChequeBookRequest;
import com.example.model.CustomerRequestList;
import com.example.model.IncreaseCreditLimit;
import com.example.model.LostStolen;

@Repository
public interface RequestRepo extends JpaRepository<CustomerRequestList,Integer>{
	
	
	@Query("select r from CustomerRequestList r where r.request_type=:type")
	List<CustomerRequestList> findAllByType(@Param("type") String type);

	@Query("select r from AddOnCard r where r.request_id =: request_id and r.status:=status")
	AddOnCard findAddOnCardRequestById(@Param("request_id") int request_id, @Param("status") String status);
	
	@Query("select r from LostStolen r where r.request_id =: request_id and r.status:=status")
	LostStolen findLostStolenRequestById(@Param("request_id") int request_id, @Param("status") String status);
	
	@Query("select r from IncreaseCreditLimit r where r.request_id =: request_id and r.status:=status")
	IncreaseCreditLimit findCreditLimitRequestById(@Param("request_id") int request_id, @Param("status") String status);
	
	@Query("select r from ChequeBookRequest r where r.request_id =: request_id and r.status:=status")
	ChequeBookRequest findChequeBookRequestById(@Param("request_id") int request_id, @Param("status") String status);



}
