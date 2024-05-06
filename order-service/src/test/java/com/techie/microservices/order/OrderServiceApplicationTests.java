package com.techie.microservices.order;

import org.flywaydb.database.mysql.MySQLConnection;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebMock
class OrderServiceApplicationTests {

	@ServiceConnection
	static MySQLConnection mySQLConnection = new MySQLConnection("mysql:8.3.0");

	@Test
	void contextLoads() {
	}

}
