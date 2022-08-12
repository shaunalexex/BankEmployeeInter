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
import com.example.model.QueryRequest;

@Repository
public interface RequestRepo extends JpaRepository<CustomerRequestList,Integer>{
	
	
	@Query(value = "select lost_stolen"+".lst_request_id, customer_request_list.request_type, lost_stolen.request_id, account.account_no, customer.customer_name, lost_stolen.request_date, lost_stolen.status from lost_stolen join customer_request_list on lost_stolen.request_id = customer_request_list.request_id join account on account.account_no = lost_stolen.account_no join customer on account.customer_id = customer.customer_id where lost_stolen.status = "
			+ " ?1 ", nativeQuery=true)
	List<Object[]> findAllByStatus(String status);
	
	
//	@Query("select u from QueryRequest u where status:=status")
//	List<QueryRequest> findAllQueriesByStatus(String status);
	
	
	
	
	
	
	
}
