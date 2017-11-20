package parser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SimpleParser {
	private ArrayList<String[]> Outputarr = new ArrayList<>();
	public  void parse(String File ,String Splitby){
		BufferedReader br = null;
        String line = " ";
        try {
        	br = new BufferedReader(new FileReader(File));
        	while ((line = br.readLine()) != null) {
        		String[] arr = line.split(Splitby);
        		this.Outputarr.add(arr);
        	}	
        } catch (FileNotFoundException e) {e.printStackTrace();}
          catch (IOException e) {e.printStackTrace();} 
          finally {
        	  if (br != null) {
        		  try {
        			  br.close();
        		  } catch (IOException e) {
        			  e.printStackTrace();
        		  }
        	  }
          }
	}
	public String[][] getOutput() {
		String[][] tmp = Outputarr.stream().toArray(String[][]::new);
		return tmp;
	}
	public static void main(String args[]) {
		SimpleParser tmp = new SimpleParser();
		tmp.parse("data/test.csv", ",");
		String [][] tmp1=tmp.getOutput();
		System.out.println(tmp1[2][1]);
	}
}

