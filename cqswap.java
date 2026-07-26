import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

public class cqswap{
	public static void main(String[] args){
	

	List<String> AlbumCO = new ArrayList<>();	
	String cInputQuery = "Korean";
	String baseQuery = "Koreans React to 'School Shooting' for the First Time";
	int TxtLines = 0;
	int tcLines = 0;

	try(BufferedReader reader = new BufferedReader(new FileReader("countries.txt"))){

		//recognize file amount of lines
		String line;
		while ((line = reader.readLine()) != null)
		{
		AlbumCO.add(line);
		TxtLines++;
		}
		reader.close();
		//get current country query from iteration and print each line

		for(int i = 0; i < TxtLines; i++){
		System.out.println(baseQuery.replace(cInputQuery, AlbumCO.get(i)));
	
		}
	}
	catch (IOException e){
	e.printStackTrace();
	}
	//close main method bracket	
	}
	//close main class bracket
}
