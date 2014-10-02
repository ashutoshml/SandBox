import java.util.*;

public class Testing {
	public static void main(String args[]) {
		String eol = System.getProperty("line.separator");
		System.out.println("HI"+eol+"HI");
		byte[] ep = eol.getBytes();
		for(int i =0;i<ep.length;++i)
		{
			System.out.println(ep[i]);
		}
	}
}