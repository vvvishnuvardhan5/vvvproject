package collecetionFramework;
// Hashset provides the element in unordered manner but will fast 
import java.util.HashSet;

public class DemoHashSet {
	// HashSet =  HashSet implementation of set doesnot follow the order but is fast and but provides  unordered format while printed  
	public static void main(String[] args) {
	   
		 // creating hash set objects
		 HashSet<String> courseNames= new HashSet<String>();
		
		 // Adding elements in to set using add method
		
		 courseNames.add("java");
		 courseNames.add("c language");
		 courseNames.add("cpp");
		 courseNames.add("Python");
		 courseNames.add("AWS");
		// printing the elements of set using for each loop
		
		          for(String s:courseNames)
		        	    System.out.println(s+" and");
		          
		          
		          //adding null values and duplicate values to check the hashset whether accepting or not
		  
		          courseNames.add("java");// duplicates are not allowed in set 
		          courseNames.add(null);// only one null is accepted 
		                    
		          
		          // printing the set values
		          System.out.println(courseNames);
	}

}
