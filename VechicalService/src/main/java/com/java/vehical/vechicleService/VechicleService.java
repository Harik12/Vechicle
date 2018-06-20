package com.java.vehical.vechicleService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.vehical.entity.Vechicle;
import com.java.vehical.vechicleDao.Vechicledao;

@Service
public class VechicleService {
	@Autowired
	private Vechicledao vechicledao;
	
public void saveDate(Vechicle vechicle2) {
	vechicledao.save(vechicle2);
	
		
	}

public Iterable<Vechicle> getAll(Vechicle vechicle) {
	// TODO Auto-generated method stub
	return vechicledao.findAll();
}

public Optional<Vechicle> getById(Integer id) {
	// TODO Auto-generated method stub
	return vechicledao.findById(id);
}

public void deletebyId(Integer id) {
	vechicledao.deleteById(id);
	
}






	

}
