package com.ipivot.java.jdbc.main;

import java.text.ParseException;
import java.util.List;

import com.ipivot.java.jdbc.dao.TravelPackageDaoImpl;
import com.ipivot.java.jdbc.dao.TravelpackageDao;
import com.ipivot.java.jdbc.data.TravelPackage;

public class PackageManager {

	public static void main(String[] args) throws ParseException {
		TravelpackageDao dao = new TravelPackageDaoImpl();  
		List<TravelPackage> packages = dao.getAllPackages();
		System.out.println(packages);
		List<TravelPackage> packages1 = dao.getPackageById(2);
		System.out.println(packages1);
		List<TravelPackage> packages2 = dao.deletePackagesById(2);
		System.out.println(packages2);
		List<TravelPackage> packages3 = dao.addPackages(packages);
		System.out.println(packages3);
		
		
		
	}

}
