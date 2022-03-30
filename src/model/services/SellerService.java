package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
 
	private SellerDao dao = DaoFactory.createSellerDao();
	public List<Seller> findAll(){
		
		return dao.findAll();
	}
	
	public void saveOrUpadte(Seller department) {
		if(department.getId() == null) {
			dao.insert(department);
		}
		else {
			dao.update(department);
		}
	}
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}
