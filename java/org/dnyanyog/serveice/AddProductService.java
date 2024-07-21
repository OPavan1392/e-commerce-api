package org.dnyanyog.serveice;

import java.sql.SQLException;

import org.dnyantog.dto.AddProductRequest;
import org.dnyantog.dto.AddProductResponse;
import org.dnyanyog.common.DBUtils;

public class AddProductService {
	
	public AddProductResponse addProduct(AddProductRequest addProduct) throws SQLException {
		AddProductResponse addproductres = new AddProductResponse();
		String resultofProductAdd = "insert into product(product_name,quantity,price)values('"+addProduct.productName+"','"+addProduct.quantity+"','"+addProduct.price+"')";
		DBUtils.ExecuteQuery(resultofProductAdd);
		addproductres.errorCode= "ooo";
		addproductres.message="added Product";
		return addproductres;
	}

}
