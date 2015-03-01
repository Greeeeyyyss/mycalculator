import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial() {  //tests the factorial of 0
		MyCalculator mc = new MyCalculator();
		int n = mc.nfactorial(0);
		assertEquals(n, 1);
	}
	
	@Test
	public void testNfactorial1() {	//tests the factorial of 1
		MyCalculator mc = new MyCalculator();
		int n = mc.nfactorial(1);
		assertEquals(n, 1);
	}
	
	@Test
	public void testNfactorial2() {		//tests the factorial of 2
		MyCalculator mc = new MyCalculator();
		int n = mc.nfactorial(2);
		assertEquals(n, 2);
	}
	
	@Test
	public void testNfactorial3() {	//tests the factorial of 3
		MyCalculator mc = new MyCalculator();
		int n = mc.nfactorial(3);
		assertEquals(n, 6);
	}

	@Test
	public void testBinarySearch() {	//search for 1 in the array with 1 element
		MyCalculator mc = new MyCalculator();
		int[] a = {1};
		int x = 1;
		int pos;
		pos = mc.binarySearch(a, x);
		assertEquals(pos, 0);		//returns 0 as the index of the number being searched
	}
	
	@Test
	public void testBinarySearch1() {	//search for 0 in the array with 1 element
		MyCalculator mc = new MyCalculator();
		int[] a = {1};
		int x = 0;
		int pos;
		pos = mc.binarySearch(a, x); //returns 1 if the element search is not found
		assertEquals(pos, 1);		
	}
	
	@Test
	public void testBinarySearch2() {	//search for 5 in the array with 1 element
		MyCalculator mc = new MyCalculator();
		int[] a = {1, 2, 4, 3, 5};
		int x = 5;
		int pos;
		pos = mc.binarySearch(a, x); //returns 4 as the index of the element being searched
		assertEquals(pos, 4);		
	}

}
