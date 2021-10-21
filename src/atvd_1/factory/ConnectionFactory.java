package atvd_1.factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource datasource;
	
	public ConnectionFactory(){
		ComboPooledDataSource comboPooledDatasource = new ComboPooledDataSource();
		comboPooledDatasource.setJdbcUrl("jdbc:mysql://localhost/bdavsprint2?useTimezone=true&serverTimezone=UTC");
		comboPooledDatasource.setUser("root");
		comboPooledDatasource.setPassword("root");

		comboPooledDatasource.setMaxPoolSize(15);
		
		this.datasource = comboPooledDatasource;
	}
	
	public Connection recuperarConexao() throws SQLException {
		return this.datasource.getConnection();
	}
}

