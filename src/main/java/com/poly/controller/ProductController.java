package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.Product;
import com.poly.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping("/product/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		model.addAttribute("item", item);
		return "product/detail";
	}

	@RequestMapping("")
	public String list(Model model) {
		List<Product> items = productService.findAll();
        return "";
    }
}
