package com.fornula.member;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DbConnectionTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void connect() throws Exception {
		Connection conn = dataSource.getConnection();
		log.info("Connection = {}, dataSource = {}", conn, dataSource);
		
		conn.close();
	}
}
