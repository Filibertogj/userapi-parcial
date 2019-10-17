package co.edu.unilibre.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.stock.entity.Userapi;
import co.edu.unilibre.stock.repository.IUserapiRepository;
import co.edu.unilibre.stock.service.IUserapiService;

@Service
public class UserapiService implements IUserapiService{

	@Autowired
	private IUserapiRepository productRepository;
	
	@Override
	public List<Userapi> getAllList() {
		return productRepository.findAll();
	}

	@Override
	public Userapi getById(Long id) {
		return productRepository.findById(id).get();
	}
	
}
