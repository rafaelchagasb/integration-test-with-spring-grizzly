package br.com.rafaelchagasb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class ConnectionDBTest {
	
	@Test
	public void testConexaoBD() throws SQLException, ClassNotFoundException{
		
		Class.forName("org.hsqldb.jdbcDriver");

        Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:data/banco","sa","");
        
        
	}
	
}
