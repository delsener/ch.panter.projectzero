/**
 * Implementation of {@link IMdpJunitDemo}.
 * 
 * @author delsener, rknecht
 * 
 */
public class MdpJunitDemoImpl implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	@Override
	public String capitalize(String s) {
		if (s == null) {
			return null;
		}
		
		if (s.length() == 1) {
			return s.toUpperCase();
		}
		
		return s.substring(0, 1).toUpperCase() + s.substring(1).toUpperCase();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		if (s == null) {
			return null;
		}
		
		char[] chars = s.toCharArray();
		String reverse = "";
		for (int i = chars.length-1; i >= 0; i--) {
			reverse += chars[i];
		}
		
		return reverse;
	}

	@Override
	public String join(String... strings) {
		if (strings == null) {
			return null;
		}
		
		String joinedStrings = "";
		for (int i = 0; i < strings.length; i++) {
			joinedStrings += strings[i];
		}
		
		return joinedStrings;
	}

}
