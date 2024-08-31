package de.hwg_lu.bwi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppAdminTables {
	java.sql.Connection jdbcConn;
	
	
	public void createTableBenutzer() throws SQLException{
		String sql = "create table Benutzer("
					+	"Vorname       varchar(64)  not null            ,"
					+   "Nachname          varchar(64)  not null            ,"
					+	"Email         varchar(16)  not null            ,"
					+	"Username  varchar(64)  not null primary key,"
					+ 	"Password varchar(64) not null,"
				   	+	"Ernaerungsart  varchar(64)  not null             "
				   	+ ")";
		System.out.println(sql);
		this.jdbcConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Benutzer angelegt");

	}
	
	public void createTableRezept() throws SQLException{
		String sql = "create table Rezept("
					+	"RezeptID      SERIAL       primary key,"
					+	"username  varchar(64)  not null primary key,"
					+   ""
				   	+ ")";
		System.out.println(sql);
		this.jdbcConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Rezept angelegt");

	}
	
	public void createTableBewertung () throws SQLException{
		String sql = "create table Bewertung("
				    +		"BewertungID     SERIAL       primary key,"
				    +		"username        varchar(64)  not null Benutzer(username),"
				    + 		"Bewertung       int          check    (Bewertung >= 1 and Bewertung <=5),"
				    +		"Kommentar       text,"
				    +		"Bewertungsdatum timestamp    Default   current_timestamp"
				    +")";
		System.out.println(sql);
		this.jdbcConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Bewertung angelegt");
	}
	
	public void createTableFavoriten() throws SQLException{
		String sql = "create table Favoriten("
				+		"FavoritenID serial primary key,"
				+		"username varchar(64) references Benutzer(username),"
				+		"RezeptID int references Rezept(RezeptID)"
				+")";
		System.out.println(sql);
		this.jdbcConn.prepareStatement(sql).executeUpdate();
		System.out.println("Table Favoriten angelegt");
	}
}
