package lab01;


 
import java.io.File; 
import java.util.Scanner; 
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = 
      new File("C:\\Users\\17301133\\Desktop\\input.txt");
        try{
    Scanner sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
    }
    catch (Exception e ){
    }
    }
    
}

