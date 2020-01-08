import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class OddEvenSets {
	
	private File file;
	private BufferedReader in;
	private TreeSet<Integer> oddSet;
	private TreeSet<Integer> evenSet;
	
	public OddEvenSets() {
		try {
			//sortedFile = new File("/home/compsci/eclipse-workspace/015BabyNames/src/names/yob" + year + "sorted.txt");
			file = new File("/home/isen/eclipse-workspace/019SetsLab2/src/oddeven.txt");
			in = new BufferedReader(new FileReader(file));
		} catch (Exception e) {
			System.out.println("file not found, exiting program");
			System.exit(0);
		}
		oddSet = new TreeSet<Integer>();
		evenSet = new TreeSet<Integer>();
		
	}
	
	public void findEvensAndOdds() throws IOException {
		int[] numArray;
		String[] line;
		while (in.ready()) {
			oddSet.clear();
			evenSet.clear();
			line = in.readLine().split(" ");
			numArray = new int[line.length];
			for (int i = 0; i < line.length; i++) {
				numArray[i] = Integer.parseInt(line[i]);
				if (numArray[i] % 2 == 0) {
					evenSet.add(numArray[i]);
				} else {
					oddSet.add(numArray[i]);
				}
			}
			System.out.println("ODDS: " + oddSet);
			System.out.println("EVENS: " + evenSet + "\n");

			
		}
		
	}

}
