package com.dsc.service;

import java.util.Optional;

import com.dsc.bean.DoubleValuedDS;

public interface DoubleValuedInterface {
	
	public Optional<DoubleValuedDS> findInDatabase(String key);
	public boolean addInDatabase(DoubleValuedDS ds);
}
