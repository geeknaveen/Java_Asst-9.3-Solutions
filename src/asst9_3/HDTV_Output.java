/*9.3) Write a program to create a class HDTV with the properties:   
		•  Brandname   
		•  Size   
	Create Another class having an ArrayList and add 3 objects of HDTV into it.  */
  
package asst9_3;

import java.util.*;       //importing all classes from java's util library..

public class HDTV_Output {

		public static void main(String[] args)        //main function declaration. and because it is static, program execution starts from main function.
		{
			ArrayList<HDTV> objectsList = new ArrayList<HDTV>();    //Creating ArrayList to store the objects of HDTV class.
			
			//Adding object elements to the ArrayList.
			objectsList.add( new HDTV("PHILIPS",55) );
			objectsList.add( new HDTV("PANASONIC",32) );
			objectsList.add( new HDTV("VIZIO",40) );
			
			//Sorting objects in the ArrayList based on the size using Comparable interface.
			Collections.sort( objectsList );
			
			Iterator<HDTV> readList = objectsList.iterator();     //Creating Iterator of ArrayList to read the list.
			System.out.println("\n******Displaying HDTV objects in sorted order of size******\n");
			while(readList.hasNext())     //While loop to print the elements.
			{
				HDTV currentObj = (HDTV) readList.next();      //fetching the current object in the iteration.
				System.out.println("BrandName: "+currentObj.brandName+" and size is "+currentObj.size);
				                             //printing details of object.
			}
			
		}    //End of main function.

	}     //End of class.