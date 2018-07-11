package br.mp.mppa.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("EmbbedTomcat")
@Configuration
public class LocalDataSource {

	@Bean(destroyMethod="close")
	@ConfigurationProperties("local.datasource")
	public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	}
	
}
