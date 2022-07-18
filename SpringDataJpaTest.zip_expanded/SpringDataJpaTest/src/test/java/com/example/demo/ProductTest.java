package com.example.demo;

import org.junit.jupiter.api.TestMethodOrder;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class ProductTest {
	@Autowired
	ProductRepository pRepo;
	@Test
	@Order(1)
	public void testCreate() {
		Product p = new Product();
		p.setId(1L);
		p.setName("Iphone XII");
		p.setDesc("Fantastic");
		p.setPrice(1000.00);
		pRepo.save(p);
		assertNotNull(pRepo.findById(1L).get());
	}
	@Test
	@Order(4)
	public void testReadAll() {
		List list=pRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	@Order(3)
	public void testRead() {
		Product product = pRepo.findById(1L).get();
		assertEquals("Iphone XII",product.getName());
	}
	@Test
	@Order(2)
	public void testUpdate() {
		Product p = pRepo.findById(1L).get();
		p.setPrice(700.00);
		pRepo.save(p);
		double price =pRepo.findById(1L).get().getPrice();
		assertEquals(700.00,price);
	}
}
