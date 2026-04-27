// Array : take society name, wing,flatno from user (using bufferreader )

import java.io.*;
class ArrayDemo{
        public static void main (String []args) throws Exception {
                BufferedReader br= new BufferedReader (new InputStreamReader(System.in));

                System.out.println("Enter society name : ");
                String society = br.readLine();

                System.out.println("enter wing : ");
                char wing = (char)br.readLine().charAt(0);

                System.out.println("enter flatno : ");
                float flatno = Float.parseFloat(br.readLine ());

                System.out.println( "soceity name: "+society);
                System.out.println("wing: "+wing);
                System.out.println("Flatno: "+flatno);
        }
}
