import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.jfugue.Note;
import org.jfugue.Pattern;
import org.jfugue.PatternTransformer;
import org.jfugue.Player;
import org.jfugue.extras.ReversePatternTransformer;
import org.jfugue.MusicStringParser.*;
import java.util.Random;

public class Music2 {

	public static void main(String[] args)
	{ 
		String[] notes = new String[21];//we received help from a TA
		char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		int ctr = 0;
		int letterPos = 0;
		Random r = new Random(); 

		for (int i = 3; i < notes.length+3; i++) {
			String temp = "";
			if (i%3 == 0) {
				//4s
				temp += c[letterPos];
				temp += Integer.toString(4);
				notes[i-3] = temp;
			} else if (i%3 == 1) {
				//5s
				temp += c[letterPos];
				temp += Integer.toString(5);
				notes[i-3] = temp;
			} else {
				//6s
				temp += c[letterPos];
				temp += Integer.toString(6);
				notes[i-3] = temp;
			}//if-else
			ctr++;
			if(ctr == 3){
				letterPos++;
				ctr = 0;
			}
		}//loop

		StringBuilder builder = new StringBuilder();
		for(String partialPattern : notes) {
			builder.append(partialPattern);
			builder.append(" "); 
		}
		System.out.println(Arrays.toString(notes));
		int rand = new Random().nextInt(notes.length);
		int rand2 = new Random().nextInt(notes.length);
		int rand3 = new Random().nextInt(notes.length);

		System.out.println(rand);
		System.out.println(Arrays.asList(notes[rand]));

		String[] pattern1Array = {"E4q", "A5q", notes[rand] + "q", notes[rand] + "q"};
		System.out.println(Arrays.toString(pattern1Array));

		//String[] pattern2Array = {"A5q, E4h", notes[rand] + "q"}; 
		//String[] pattern3Array = {notes[rand] + "q", notes[rand] + "q", notes[rand] + "q", notes[rand] + "q"};
		for(String partialPattern : pattern1Array) {
			builder.append(partialPattern);
			builder.append(" ");
		}

		Pattern pattern1 = new Pattern(builder.toString());
		System.out.println("*");
		Pattern pattern2 = new Pattern("A5q E4h " + notes[rand] + "q");
		System.out.println("*");

		Pattern pattern3 = new Pattern(notes[rand] + "q" + " " + notes[rand] + "q" + " " + notes[rand2] + "q" + " " + notes[rand3] + "q"); 
		//System.out.println(pattern3); 

		Pattern song = new Pattern(); 

		song.add(pattern1, 1); 
		song.add(pattern2, 1);
		song.add(pattern3, 1);
		System.out.println(song);

        	Player player = new Player();
		player.play(song);
		System.out.println("*");

        try {  
              	 player.saveMidi(song, new File("Experiment.mid"));
		

	} catch (IOException e) {
		e.printStackTrace();
	}

	player.close();

	}

}

