package com.hcl.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	BinaryTree bt;
	@BeforeEach
	void setUp() throws Exception {
		bt = BinaryTreeFactory.createBinaryTree();
		System.out.println("in setup");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void confirmContainsNodeWithCorrectNumber() {
		//fail("Not yet implemented");
		assertTrue(bt.containsNode(3));
		
	}
	@Test
	void confirmContainsNodeWithInCorrectNumber() {
		//fail("Not yet implemented");
		assertFalse(bt.containsNode(30));
		
	}

}
