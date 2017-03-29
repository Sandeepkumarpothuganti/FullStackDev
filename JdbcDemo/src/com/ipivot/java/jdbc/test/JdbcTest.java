package com.ipivot.java.jdbc.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ipivot.java.jdbc.dao.TravelPackageDaoImpl;
import com.ipivot.java.jdbc.dao.TravelpackageDao;
import com.ipivot.java.jdbc.data.TravelPackage;

public class JdbcTest {

	@Test
	public void test() {
	
			
			TravelpackageDao dao = new TravelPackageDaoImpl();  
			List<TravelPackage> packages = dao.getAllPackages();
			System.out.println(packages);
			
			assert(packages.size()>0);
			
		
		
	}

}
