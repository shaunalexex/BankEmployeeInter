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
	List<Object[]> findAllByStatuslst(String status);
	
	@Query(value = "select cheque_book_request.chequebook_id, customer_request_list.request_type, cheque_book_request.request_id, account.account_no, customer.customer_name, cheque_book_request.request_date, cheque_book_request.status from cheque_book_request join customer_request_list on cheque_book_request.request_id = customer_request_list.request_id join account on account.account_no = cheque_book_request.account_no join customer on account.customer_id = customer.customer_id where cheque_book_request.status = "
			+ " ?1 ", nativeQuery=true)
	List<Object[]> findAllByStatuscbr(String status);
	
	@Query(value = "select add_on_card.addon_card_request_id, customer_request_list.request_type, add_on_card.request_id, account.account_no, customer.customer_name, add_on_card.request_date, add_on_card.status from add_on_card join customer_request_list on add_on_card.request_id = customer_request_list.request_id join account on account.account_no = add_on_card.account_no join customer on account.customer_id = customer.customer_id where add_on_card.status = "
			+ " ?1 ", nativeQuery=true)
	List<Object[]> findAllByStatusaoc(String status);
	
	@Query(value = "select credit_limit.creditlimit_id, customer_request_list.request_type, credit_limit.request_id, account.account_no, customer.customer_name, credit_limit.request_date, credit_limit.status from credit_limit join customer_request_list on credit_limit.request_id = customer_request_list.request_id join account on account.account_no = credit_limit.account_no join customer on account.customer_id = customer.customer_id where credit_limit.status = "
			+ " ?1 ", nativeQuery=true)
	List<Object[]> findAllByStatuscl(String status);
	
	@Query(value = "select lost_stolen"+".lst_request_id, customer_request_list.request_type, lost_stolen.request_id, account.account_no, customer.customer_name, lost_stolen.request_date, lost_stolen.status from lost_stolen join customer_request_list on lost_stolen.request_id = customer_request_list.request_id join account on account.account_no = lost_stolen.account_no join customer on account.customer_id = customer.customer_id", nativeQuery=true)
	List<Object[]> findAlllst(String status);
	
	@Query(value = "select cheque_book_request.chequebook_id, customer_request_list.request_type, cheque_book_request.request_id, account.account_no, customer.customer_name, cheque_book_request.request_date, cheque_book_request.status from cheque_book_request join customer_request_list on cheque_book_request.request_id = customer_request_list.request_id join account on account.account_no = cheque_book_request.account_no join customer on account.customer_id = customer.customer_id", nativeQuery=true)
	List<Object[]> findAllcbr(String status);
	
	@Query(value = "select add_on_card.addon_card_request_id, customer_request_list.request_type, add_on_card.request_id, account.account_no, customer.customer_name, add_on_card.request_date, add_on_card.status from add_on_card join customer_request_list on add_on_card.request_id = customer_request_list.request_id join account on account.account_no = add_on_card.account_no join customer on account.customer_id = customer.customer_id", nativeQuery=true)
	List<Object[]> findAllaoc(String status);
	
	@Query(value = "select credit_limit.creditlimit_id, customer_request_list.request_type, credit_limit.request_id, account.account_no, customer.customer_name, credit_limit.request_date, credit_limit.status from credit_limit join customer_request_list on credit_limit.request_id = customer_request_list.request_id join account on account.account_no = credit_limit.account_no join customer on account.customer_id = customer.customer_id", nativeQuery=true)
	List<Object[]> findAllcl(String status);
	
	
	
	
	
	
	
//	@Query("select u from QueryRequest u where status:=status")
//	List<QueryRequest> findAllQueriesByStatus(String status);
	
	
	
	
	
	
	
}
