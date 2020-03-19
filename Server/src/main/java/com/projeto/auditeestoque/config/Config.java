package com.projeto.auditeestoque.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;

//@Configuration
public class Config {
    	
	//@Bean
    public DataSource dataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        //dataSourceBuilder.url("jdbc:sqlite:D:\\developer_jobs.sqlite");
        dataSourceBuilder.url("jdbc:sqlite:C:\\temp\\developerDB.sqlite");
        return dataSourceBuilder.build();
    }
}
