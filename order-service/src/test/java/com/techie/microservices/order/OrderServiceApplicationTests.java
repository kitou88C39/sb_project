package com.techie.microservices.order;

import org.flywaydb.database.mysql.MySQLConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebMock(port = 0)
class OrderServiceApplicationTests {

	@ServiceConnection
	static MySQLConnection mySQLConnection = new MySQLConnection("mysql:8.3.0");
	@LocalServerPort
	private Integer port;

	@BeforeEach
	void setup() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = port;
	}

	static {
		mySQLConnection.start();
	}

	@Test
	void shouldSubmitOrder() {
		String submitOrderJson = ""
	}

}
