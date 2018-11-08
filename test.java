
public class test {								// call class

	public static void main (String[] args) {				// call main method

		final int limit = 21;						// declare int limit of size 22; 22 notes
		String[] notes = new String[limit];				// declare string array notes with size 22

		for (int i = 0; i < notes.length; i++) {
			//
			for (int value = 4; value < 7; value++) {

				for (char c = 'A'; c <='G'; c++) {

					String temp = Integer.toString(value);
					String result = (c+temp);
					//System.out.println(letter);
					//System.out.println(value);
					//System.out.println(result);

					notes[i] = result;
				}
				//System.out.println("notes: " + notes);
				//System.out.println("array: " + notes[limit-1]);
			}
		}
		System.out.println("array: " + notes[limit-1]);
	}
}

