import static org.junit.Assert.*;

import org.junit.Test;



public class DAG_Test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
    @Test
	public void testIfEmpty() {
		DAG dag = new DAG(10);
		assertEquals(-1, dag.findLCA(2,3));
	}

}
