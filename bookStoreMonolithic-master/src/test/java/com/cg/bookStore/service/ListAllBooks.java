package com.cg.bookStore.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookStore.dao.BookStoreDao;
import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.exceptions.BookException;
import com.cg.bookStore.exceptions.CategoryException;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ListAllBooks {
	@Mock
	private BookStoreDao dao;
	
	@Autowired
	private ManageBookServiceImpl service;
	
	@Test
	public void bookNotExistTest() throws BookException {
		
		List<BookInformation> bookInformation=service.displayBooks();
	assertFalse(bookInformation.isEmpty());
	}


}
