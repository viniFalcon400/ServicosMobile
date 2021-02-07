/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcoelho.servicosmobile.entity;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vinicius
 */
public class UserSystemIT {
	
	public UserSystemIT() {
	}
	
	@BeforeAll
	public static void setUpClass() {
	}
	
	@AfterAll
	public static void tearDownClass() {
	}
	
	@BeforeEach
	public void setUp() {
	}
	
	@AfterEach
	public void tearDown() {
	}

	/**
	 * Test of builder method, of class UserSystem.
	 */
	@Test
	public void testBuilder() {
		System.out.println("builder");
		UserSystem.UserSystemBuilder expResult = null;
		UserSystem.UserSystemBuilder result = UserSystem.builder();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getId method, of class UserSystem.
	 */
	@Test
	public void testGetId() {
		System.out.println("getId");
		UserSystem instance = new UserSystem();
		Long expResult = null;
		Long result = instance.getId();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getNome method, of class UserSystem.
	 */
	@Test
	public void testGetNome() {
		System.out.println("getNome");
		UserSystem instance = new UserSystem();
		String expResult = "";
		String result = instance.getNome();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getEmail method, of class UserSystem.
	 */
	@Test
	public void testGetEmail() {
		System.out.println("getEmail");
		UserSystem instance = new UserSystem();
		String expResult = "";
		String result = instance.getEmail();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getSenha method, of class UserSystem.
	 */
	@Test
	public void testGetSenha() {
		System.out.println("getSenha");
		UserSystem instance = new UserSystem();
		String expResult = "";
		String result = instance.getSenha();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setId method, of class UserSystem.
	 */
	@Test
	public void testSetId() {
		System.out.println("setId");
		Long id = null;
		UserSystem instance = new UserSystem();
		instance.setId(id);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setNome method, of class UserSystem.
	 */
	@Test
	public void testSetNome() {
		System.out.println("setNome");
		String nome = "";
		UserSystem instance = new UserSystem();
		instance.setNome(nome);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setEmail method, of class UserSystem.
	 */
	@Test
	public void testSetEmail() {
		System.out.println("setEmail");
		String email = "";
		UserSystem instance = new UserSystem();
		instance.setEmail(email);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setSenha method, of class UserSystem.
	 */
	@Test
	public void testSetSenha() {
		System.out.println("setSenha");
		String senha = "";
		UserSystem instance = new UserSystem();
		instance.setSenha(senha);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of equals method, of class UserSystem.
	 */
	@Test
	public void testEquals() {
		System.out.println("equals");
		Object o = null;
		UserSystem instance = new UserSystem();
		boolean expResult = false;
		boolean result = instance.equals(o);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of canEqual method, of class UserSystem.
	 */
	@Test
	public void testCanEqual() {
		System.out.println("canEqual");
		Object other = null;
		UserSystem instance = new UserSystem();
		boolean expResult = false;
		boolean result = instance.canEqual(other);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of hashCode method, of class UserSystem.
	 */
	@Test
	public void testHashCode() {
		System.out.println("hashCode");
		UserSystem instance = new UserSystem();
		int expResult = 0;
		int result = instance.hashCode();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of toString method, of class UserSystem.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		UserSystem instance = new UserSystem();
		String expResult = "";
		String result = instance.toString();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
