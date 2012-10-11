import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the implementation of {@link IMdpJunitDemo}.
 * 
 * @author delsener, rknecht
 * 
 */
public class MdpJunitDemoImplTest {

	private IMdpJunitDemo mdpJunitDemo = new MdpJunitDemoImpl();

	@Test
	public void testEmptyStringCheck() throws Exception {
		Assert.assertTrue(mdpJunitDemo.isEmpty(""));
		Assert.assertFalse(mdpJunitDemo.isEmpty(" "));
	}

	@Test
	public void testCapitalize() {
		Assert.assertEquals("ABCD", mdpJunitDemo.capitalize("abcd"));
	}

	@Test
	public void testReverse() {
		Assert.assertEquals("DCBA", mdpJunitDemo.reverse("ABCD"));
	}

	@Test
	public void testJoin() {
		Assert.assertEquals("ABCDEF", mdpJunitDemo.join("AB", "CD", "EF"));
	}

}
