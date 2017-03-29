package com.ipivot.java.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ipivot.java.jdbc.con.Jdbccon;
import com.ipivot.java.jdbc.data.TravelPackage;

public class TravelPackageDaoImpl implements TravelpackageDao {

	public List<TravelPackage> getAllPackages() {
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;

		List<TravelPackage> packages = null;

		String query = "SELECT * FROM travelpackage";
		try {
			connection = Jdbccon.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			packages = new ArrayList<TravelPackage>();

			while (rs.next()) {
				TravelPackage pkg = new TravelPackage();
				pkg.setName(rs.getString("name"));
				pkg.setId(rs.getString("id"));
				pkg.setStartDate(rs.getDate("startDate"));
				pkg.setEndDate(rs.getDate("endDate"));
				pkg.setPrice(rs.getInt("price"));
				pkg.setDesc(rs.getString("description"));
				packages.add(pkg);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return packages;
	}

	public List<TravelPackage> getPackageById(int id) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;

		List<TravelPackage> packages = null;

		String query = "SELECT * FROM travelpackage where id=" + id;
		try {
			connection = Jdbccon.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			packages = new ArrayList<TravelPackage>();

			while (rs.next()) {
				TravelPackage pkg = new TravelPackage();
				pkg.setName(rs.getString("name"));
				pkg.setId(rs.getString("id"));
				pkg.setStartDate(rs.getDate("startDate"));
				pkg.setEndDate(rs.getDate("endDate"));
				pkg.setPrice(rs.getInt("price"));
				pkg.setDesc(rs.getString("description"));
				packages.add(pkg);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return packages;
	}

	public List<TravelPackage> addPackages(List<TravelPackage> package1) throws ParseException {
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<TravelPackage> packages = null;

		String query = "INSERT INTO travelpackage VALUES("+((TravelPackage) package1).setId("4")+",'"+((TravelPackage) package1).setName("silver")+
					"','"+((TravelPackage) package1).setPrice(800)+"','"+((TravelPackage) package1).setStartDate(sdf.parse("21/03/2016"))+"','"+((TravelPackage) package1).setEndDate(sdf.parse("03/04/2016"))+"','"+((TravelPackage) package1).setDesc("silver Package")+")";
		
		try {
			connection = Jdbccon.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(query);

			packages = new ArrayList<TravelPackage>();

//			while (rs.next()) {
//				TravelPackage pkg = new TravelPackage();
//				pkg.setName(rs.getString("name"));
//				pkg.setId(rs.getString("id"));
//				pkg.setStartDate(rs.getDate("startDate"));
//				pkg.setEndDate(rs.getDate("endDate"));
//				pkg.setPrice(rs.getInt("price"));
//				pkg.setDesc(rs.getString("description"));
//				packages.add(pkg);
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return packages;
	}

		

	public List<TravelPackage> updatePackages() {

		return null;
	}

	@SuppressWarnings("finally")
	public List<TravelPackage> deletePackagesById(int id) {
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null;

		List<TravelPackage> packages = null;
		
		String query = "delete FROM travelpackage where id="+id;
		try {
			connection = Jdbccon.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			packages = new ArrayList<TravelPackage>();
		}
					
//			while (rs.next()) {
//				TravelPackage pkg = new TravelPackage();
//				pkg.setName(rs.getString("name"));
//				pkg.setId(rs.getString("id"));
//				pkg.setStartDate(rs.getDate("startDate"));
//				pkg.setEndDate(rs.getDate("endDate"));
//				pkg.setPrice(rs.getInt("price"));
//				pkg.setDesc(rs.getString("description"));
//				packages.add(pkg);
//			}
			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} 
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	
		return packages;
	}
	}
}

	
