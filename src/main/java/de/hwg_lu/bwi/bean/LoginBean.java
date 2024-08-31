package de.hwg_lu.bwi.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bwi.jdbc.NoConnectionException;
import de.hwg_lu.bwi.jdbc.PostgreSQLAccess;

public class LoginBean {
	String username;
	String email;
	String vorname;
	String nachname;
	String ernaehrungsart;
	String password;
	Connection dbConn;
	
	
	public LoginBean()throws NoConnectionException{
		this.username = "";
		this.password= "";
		this.email= "";
		this.vorname="";
		this.nachname="";
		this.ernaehrungsart= "";
		this.dbConn = new PostgreSQLAccess().getConnection();
		
	}
	
	public boolean checkUsernamePasswort() throws SQLException{
		String sql = "Select username from account where username = ? and password = ?";
		System.out.println(sql);
		PreparedStatement prep = this.dbConn.prepareStatement(sql);
		prep.setString(1, this.username);
		prep.setString(1, this.password);
		return prep.executeQuery().next();
	}
	
	//Registrierung
	
	public void insertBenutzerNoCheck() throws SQLException{
		String sql = "insert into Benutzer (Vorname, Nachname, Email, Username, password, Ernaehrungsart"
				+ "values(?,?,?,?,?,?)";
		System.out.println(sql);
		
		PreparedStatement prep = this.dbConn.prepareStatement(sql);
		
		prep.setString(1, this.vorname);
		prep.setString(1, this.nachname);
		prep.setString(1, this.email);
		prep.setString(1, this.username);
		prep.setString(1, this.password);
		prep.setString(1, this.ernaehrungsart);
		
		prep.executeUpdate();
		System.out.println("Benutzer mit username" + this.username + " angelegt");
	}
	
	
	public boolean checkBenutzerExists() throws SQLException{
		String sql = "select username from Benutzer where username = ?";
		System.out.println(sql);
		PreparedStatement prep = this.dbConn.prepareStatement(sql);
		prep.setString(1, this.username);
		ResultSet dbRes = prep.executeQuery();
		return dbRes.next();
	}
	
	
	public boolean insertAccountIfNotExists() throws SQLException{
		if (!this.checkBenutzerExists()) {
			this.insertBenutzerNoCheck();
			return true;
		}else {
			return false;
		}
	}
	

	// Getters und Setters

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getErnaehrungsart() {
		return ernaehrungsart;
	}

	public void setErnaehrungsart(String ernaehrungsart) {
		this.ernaehrungsart = ernaehrungsart;
	}
	
	
	
	
}
