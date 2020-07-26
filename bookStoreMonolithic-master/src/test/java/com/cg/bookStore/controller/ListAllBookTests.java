package com.cg.bookStore.controller;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.web.context.WebApplicationContext;

import com.cg.bookStore.exceptions.BookException;
import com.cg.bookStore.service.ManageBookService;
import com.cg.bookStore.web.ManageBookController;
import com.cg.bookStore.web.ManageCategoryController;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ManageBookController.class)
public class ListAllBookTests {
	 @Autowired
  private MockMvc mockMvc;
  @Autowired
  private WebApplicationContext webApplicationContext;
  @MockBean 
  private ManageBookService manageBookService;
  @Before
  public void setUp() {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();}
    
    @Test(expected=BookException.class)
    public void bookNotFound() throws Exception {
      /* setup mock */
      when(manageBookService.displayBooks()).thenThrow(new BookException());
      mockMvc.perform(get("/manageBook/display") 
              .accept(MediaType.APPLICATION_JSON))
              .andExpect((ResultMatcher) new BookException("BOOK_DOES_NOT_EXIST"));
    }
  }
