/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//package com.rslakra.shipwreck.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
///**
// * @author Rohtash Singh Lakra
// * @version 1.0.0
// */
//@Configuration
//public class PersistenceConfiguration {
//
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	@Primary
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
//
//	@Bean
//	@ConfigurationProperties(prefix = "spring.flyway")
//	@FlywayDataSource
//	public DataSource flyWayDataSource() {
//		return DataSourceBuilder.create().build();
//	}
//}
