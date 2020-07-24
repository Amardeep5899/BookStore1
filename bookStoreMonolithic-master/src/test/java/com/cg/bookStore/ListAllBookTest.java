package com.cg.bookStore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookStore.dao.BookStoreDao;
import com.cg.bookStore.entities.BookInformation;
import com.cg.bookStore.exceptions.BookException;
import com.cg.bookStore.service.ManageBookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListAllBookTest {
	@Autowired
	private BookStoreDao dao;
	@Test
	public void listBookTest() throws BookException
	{
		List<BookInformation> bookInformation=dao.listAllBooks();
		assertFalse(bookInformation.isEmpty());
	}


}
