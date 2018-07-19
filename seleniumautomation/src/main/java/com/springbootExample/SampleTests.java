/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Jul 17, 2018
 */

package com.springbootExample;
import org.junit.Test;
import org.junit.runner.RunWith;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)


/**
 * @author n0217055
 *
 */
public class SampleTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void exampleTest() {
		this.webClient.get().uri("/").exchange().expectStatus().isOk()
				.expectBody(String.class).isEqualTo("Hello World");
	}
	


		@Test
		public void exampleTest1() {
			
			System.out.println("Hi");
		
		}

	}


