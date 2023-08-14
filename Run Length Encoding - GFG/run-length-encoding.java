//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG {
    String encode(String str) {
        if(str==null || str.isEmpty()){
            return str;
        }
        StringBuilder ans= new StringBuilder();
        int count =1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                ans.append(str.charAt(i-1)).append(count);
                count=1;
            }
        }
        ans.append(str.charAt(str.length()-1)).append(count);
        return ans.toString();
        
    }
}
