package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj); //insere objeto no banco de dados
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
