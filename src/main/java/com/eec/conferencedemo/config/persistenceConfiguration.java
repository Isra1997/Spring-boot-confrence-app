package com.eec.conferencedemo.config;

import java.security.PublicKey;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class persistenceConfiguration {

  @Value("${password}")
  String password;

  @Bean
  public DataSource getDataSource(){
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.url("jdbc:postgresql://localhost:5432/conference_app");
    dataSourceBuilder.password(password);
    return dataSourceBuilder.build();
  }
}
