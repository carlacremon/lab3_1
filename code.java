//Revision made by aleandrade
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class perimeterCalculator {
	public static void main(String[] args) {
          
            int width, length, perimeter = 0; // Rectangle parameters

            try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //buffer for reading terminal entries
			System.out.println("Please enter length of a rectangle");
                        length = Integer.parseInt(br.readLine());
			System.out.println("Please enter width of a rectangle");
			width = Integer.parseInt(br.readLine());
              
                        perimeter = (2*width) + (2*length); //Calculates perimeter
                        System.out.printf("Perimeter of a rectangle is %d\n", perimeter);//Displays perimeter result on terminal
                        
                        br.close(); //Closing buffer
                        
		} catch(NumberFormatException ne) { //Exception launched if input number is not on correct format
			System.out.println("Invalid value" + ne);// prints exception parameters and exits
			System.exit(0);
		} catch(IOException ioe) {//Exception launched when I/O is interrupted or fails
			System.out.println("IO Error :" + ioe);// prints exception parameters and exits
			System.exit(0);
		}
	}
}
