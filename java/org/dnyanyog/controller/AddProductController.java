package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyantog.dto.AddProductRequest;
import org.dnyantog.dto.AddProductResponse;
import org.dnyanyog.serveice.AddProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {
	@PostMapping("/product")
	public AddProductResponse addproduct(@RequestBody AddProductRequest addproduct) throws SQLException {
		return new AddProductService().addProduct(addproduct);
	}
}
