package MavenRepository;

import java.io.IOException;
import java.util.ArrayList;

public class Testsample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datadriven d=new Datadriven();
		ArrayList<String> data=d.getdata("delete");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

}
