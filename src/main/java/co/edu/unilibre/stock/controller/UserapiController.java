package co.edu.unilibre.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.stock.entity.Userapi;
import co.edu.unilibre.stock.service.IUserapiService;

@RestController
public class UserapiController {
	@Autowired
	private IUserapiService productService;
	
	@GetMapping("/list-user")
	public List<Userapi> getList(){
		return productService.getAllList();
	}
	
	@GetMapping("/{id}")
	public Userapi getById(@PathVariable Long id) {
		return productService.getById(id);
	}
}
