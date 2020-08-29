package com.cc.pos.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cc.pos.product.entity.ProductLineItem;

@Repository
public interface ProductLineItemRepository extends JpaRepository<com.cc.pos.product.entity.ProductLineItem,Long>  {
	
	//@Query(value = "select * from public.product_line_item u where u.branch  = ?1", nativeQuery = true )
	//List<ProductLineItem> findByBranchEndsWith(Long branchId);

	List<ProductLineItem> findAllByBranch(Long branchId);

}
