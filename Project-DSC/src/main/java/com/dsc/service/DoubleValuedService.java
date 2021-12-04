package com.dsc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsc.bean.DoubleValuedDS;
import com.dsc.persistance.DatabasePersistance;

@Service
public class DoubleValuedService implements DoubleValuedInterface {

	@Autowired
	private DatabasePersistance persistance;
	@Override
	public Optional<DoubleValuedDS> findInDatabase(String key) {
		return persistance.findById(key);
	}
	@Override
	public boolean addInDatabase(DoubleValuedDS ds) {
		try{
			persistance.save(ds);
		}catch(Exception e) {
			return false;
		}
		return true;
	}

}
