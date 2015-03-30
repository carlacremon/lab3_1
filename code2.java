//Created by: Carla Carolina Cremon, RA 135238, Class:EA975 L, gerrit/git user: ra135238
//Revised by: Alexandre Gomes Andrade, RA 134762, Class:EA975 L, gerrit/git user: aleandrade

//Program that reads width and length values of a rectangle from terminal and displays on terminal it's perimeter value

//Importing neccessary libraries
//library for Buffer that stores inputs
import java.io.BufferedReader;
//Exceptions used for handling possible issues
import java.io.IOException;
import java.io.InputStreamReader;

class perimeterCalculator {
	public static void main(String[] args) {
	    // Rectangle parameters
            int width, length, perimeter = 0;
		
            try {
              		//buffer for reading terminal entries
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter length of a rectangle");
                        //Reads value from terminal and stores on lenght variable
              		length = Integer.parseInt(br.readLine());
			System.out.println("Please enter width of a rectangle");
			//Reads value from terminal and stores on width variable
              		width = Integer.parseInt(br.readLine());
                        
             		 //Calculates perimeter
                        perimeter = (2*width) + (2*length);
                        //Displays perimeter result on terminal
              		System.out.printf("Perimeter of a rectangle is %d\n", perimeter);
                        
              		//Closing buffer
                        br.close();
                       
                //Exception launched if input number is not on correct format
		} catch(NumberFormatException ne) { 
              		// prints exception parameters and exits
			System.out.println("Invalid value" + ne);
			System.exit(0);
              	//Exception launched when I/O is interrupted or fails
		} catch(IOException ioe) {
			// prints exception parameters and exits
              		System.out.println("IO Error :" + ioe);
			System.exit(0);
		}
	}
}


