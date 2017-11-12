package com.greenfox.rest;

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

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class RestTest {

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

//TESTS FOR DOUBLING

    @Test
    public void testDoubling() throws Exception {
        mockMvc.perform(get("/doubling?input=5"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(10)))
                .andExpect(jsonPath("$.received", is(5)));
    }

    @Test
    public void testTypoInUrl() throws Exception {
        mockMvc.perform(get("/ddoubling?input=5"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    public void testDoublingNoInput() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("error", is("Please provide an input!")));
    }

//TESTS FOR GREET

    @Test
    public void testGreet() throws Exception {
        mockMvc.perform(get("/greeter?name=mikorkakalman&title=szerencsecsomag"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there mikorkakalman, my dear szerencsecsomag!")));
    }

    @Test
    public void testGreetNoNameProvided() throws Exception {
        mockMvc.perform(get("/greeter?title=szerencsecsomag"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("error", is("Please provide a name!")));
    }

    @Test
    public void testGreetNoTitleProvided() throws Exception {
        mockMvc.perform(get("/greeter?name=mikorkakalman"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("error", is("Please provide a title!")));
    }

//TESTS FOR DOUNTIL

    @Test
    public void testDoUntilFactor() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"doUntil\" : 5}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(120)));
    }

    @Test
    public void testDountilSum() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"doUntil\": 5}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(15)));
    }

    @Test
    public void testDountilNoUntilProvided() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("error", is("Please provide a number!")));
    }

    @Test
    public void testDountilNoWhatProvided() throws Exception {
        mockMvc.perform(post("/dountil")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"doUntil\": 5}"))
                .andExpect(status().is4xxClientError())
                .andExpect(content().contentType(contentType));
    }

}
