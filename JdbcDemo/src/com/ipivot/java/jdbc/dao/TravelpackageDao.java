package com.ipivot.java.jdbc.dao;

import java.text.ParseException;
import java.util.List;

import com.ipivot.java.jdbc.data.TravelPackage;

public interface TravelpackageDao {
		List<TravelPackage> getAllPackages();
		List<TravelPackage> getPackageById(int id);
	
		List<TravelPackage> updatePackages();
		List<TravelPackage> deletePackagesById(int id);
		
		List<TravelPackage> addPackages(List<TravelPackage> package1) throws ParseException;
	
		
		


	}
