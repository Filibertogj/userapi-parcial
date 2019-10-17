package co.edu.unilibre.stock.service;

import java.util.List;

import co.edu.unilibre.stock.entity.Userapi;

public interface IUserapiService {
	public List<Userapi> getAllList();
	public Userapi getById(Long id);
}
