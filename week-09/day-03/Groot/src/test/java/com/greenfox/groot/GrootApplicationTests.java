package com.greenfox.groot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class GrootApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void grootTestWithMessage() throws Exception {
		mockMvc.perform(get("/groot?message=rugroot"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.translated", is("I am Groot")));
	}

	@Test
	public void grootTestNoMesszidzs() throws Exception {
		mockMvc.perform(get("/groot"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("error", is("I am Groot")));
	}

	@Test
	public void grootTest404() throws Exception {
		mockMvc.perform(get("/groot/blabla"))
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void yonduTestEverythingGiven() throws Exception {
		mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.distance", is(100.0d)))
				.andExpect(jsonPath("$.time", is(10.0d)))
				.andExpect(jsonPath("$.speed", is(10.0d)));
	}

	@Test
	public void yonduTestSomethingsMissing() throws Exception {
		mockMvc.perform(get("/yondu"))
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("error", is("ERROR!!!44!44!!!")));
	}

	@Test
	public void yonduTest404() throws Exception {
		mockMvc.perform(get("/yondu/blabla"))
				.andExpect(status().is4xxClientError());
	}

}
