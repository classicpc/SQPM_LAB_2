package com.ontariotechu.sofe3980U;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(BinaryAPIController.class)
public class BinaryAPIControllerTest {

    @Autowired
    private MockMvc mvc;

   
    @Test
    public void add() throws Exception {
        this.mvc.perform(get("/add").param("operand1","111").param("operand2","1010"))//.andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string("10001"));
    }
	@Test
    public void add2() throws Exception {
        this.mvc.perform(get("/add_json").param("operand1","111").param("operand2","1010"))//.andDo(print())
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.operand1").value(111))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand2").value(1010))
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value(10001))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operator").value("add"));
    }
	
	@Test
	public void multiply() throws Exception {
		this.mvc.perform(get("/multiply").param("operand1","11").param("operand2","101"))//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string("1111"));
	}
	
	@Test
	public void multiplyJSON() throws Exception {
		this.mvc.perform(get("/multiply_json").param("operand1","11").param("operand2","101"))//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand1").value(11))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand2").value(101))
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value(1111))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operator").value("multiply"));
	}
	
	@Test
	public void and() throws Exception {
		this.mvc.perform(get("/and").param("operand1","111").param("operand2","101"))//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string("101"));
	}
	
	@Test
	public void andJSON() throws Exception {
		this.mvc.perform(get("/and_json").param("operand1","111").param("operand2","101"))//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand1").value(111))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand2").value(101))
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value(101))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operator").value("and"));
	}
	
	@Test
	public void or() throws Exception {
		this.mvc.perform(get("/or").param("operand1","101").param("operand2","011"))//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().string("111"));
	}
	
	@Test
	public void orJSON() throws Exception {
		this.mvc.perform(get("/or_json").param("operand1","101").param("operand2","011"))//.andDo(print())
			.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand1").value(101))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operand2").value(11))
			.andExpect(MockMvcResultMatchers.jsonPath("$.result").value(111))
			.andExpect(MockMvcResultMatchers.jsonPath("$.operator").value("or"));
	}

}