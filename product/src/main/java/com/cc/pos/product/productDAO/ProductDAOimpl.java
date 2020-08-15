package com.cc.pos.product.productDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cc.pos.product.bean.Product;
import com.cc.pos.product.bean.ProductLineItem;
import com.cc.pos.product.requestResponse.ProductRequest;
import com.cc.pos.product.requestResponse.ProductResponse;

@Component
public class ProductDAOimpl implements ProductDAO {

	@Override
	public ProductResponse menu(ProductRequest pr) {
		ProductResponse response=new ProductResponse();
		List<Product> plst=new ArrayList<Product>();
		Product p=new Product();
		p.setId("P100");
		p.setName("Shawarma");
		p.setActive(true);
		p.setDescription("This is Shawarma item");
		p.setImage("img1.png");
		
		List<ProductLineItem> piLst=new ArrayList<ProductLineItem>();
		piLst.add(new ProductLineItem("PI1000","Chees Shawarma","This is Chees Shawarma",true,"img2.png",111.23));
		piLst.add(new ProductLineItem("PI1001","Chicken Shawarma","This is Chicken Shawarma",true,"img2.png",111.23));
		piLst.add(new ProductLineItem("PI1002","Paneer Shawarma","This is Paneer Shawarma",true,"img2.png",111.23));
		piLst.add(new ProductLineItem("PI1003","Dubai Shawarma","This is Dubai Shawarma",true,"img2.png",111.23));
		
		p.setProductList(piLst);
		plst.add(p);
		
		
		Product momoms=new Product();
		momoms.setId("P200");
		momoms.setName("Momos");
		momoms.setActive(true);
		momoms.setDescription("This is Momos item");
		momoms.setImage("img2.png");
		
		List<ProductLineItem> momomsLst=new ArrayList<ProductLineItem>();
		momomsLst.add(new ProductLineItem("PI1000","Chees Momos","This is Chees Momos",true,"img2.png",111.23));
		momomsLst.add(new ProductLineItem("PI1001","Chicken Momos","This is Chicken Momos",true,"img2.png",111.23));
		momomsLst.add(new ProductLineItem("PI1002","Paneer Momos","This is Paneer Momos",true,"img2.png",111.23));
		momomsLst.add(new ProductLineItem("PI1003","Dubai Momos","This is Dubai Momos",true,"img2.png",111.23));
		
		momoms.setProductList(momomsLst);
		plst.add(momoms);
		
		response.setBranchId(pr.getBranchId());
		response.setProduct(plst);
		return response;
	}

}
