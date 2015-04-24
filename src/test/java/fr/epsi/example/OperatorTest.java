package fr.epsi.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OperatorTest {
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@Test
	public void addTest() {
		// TODO
		Operator operator = new Operator();
		assertEquals(5, operator.add(2, 3));
		System.out.println("execute");
	}
	
	@Test
	public void addTest2() {
		// TODO
		Operator operator = new Operator();
		assertEquals(5, operator.add(2, 3));
		System.out.println("execute");
	}
	
	@Test
	public void addTestFour() {
		Operator operator = new Operator();
		Bidon bidon = mock(Bidon.class);
		when(bidon.returnFour()).thenReturn(4);
		operator.setBidon(bidon);
		assertEquals(4, operator.addFour(0));
	}
	
	@After
	public void after() {
		System.out.println("after");
	}

}
