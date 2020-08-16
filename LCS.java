import java.io.*;

public class Lab08{
    
    public static void LCS(String X,String Y,int m,int n){
        int A[][]=new int [m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    A[i][j]=0;
                }
                else if(X.charAt(i-1) == Y.charAt(j-1) ){
                    A[i][j]=A[i-1][j-1]+1;
                }
                else{
                    A[i][j]=Math.max(A[i-1][j],A[i][j-1]);
                }
            }
        }
        int index=A[m][n];
        int store=index;
        System.out.println("Length of the LCS is "+A[m][n]);
         
        char LcsFinal[]=new char[index+1];
       // LcsFinal[index]=' ';
        int p=m, q=n;
       
        while (p > 0 && q > 0) 
        { 
            
            if (X.charAt(p-1) == Y.charAt(q-1)) 
            { 
                
                LcsFinal[index-1] = X.charAt(p-1);  
                  System.out.println("LCS at :"+LcsFinal[index-1]);
               
                p--;  
                q--;  
                index--;      
            } 
   
            
            else if (A[p-1][q] >A[p][q-1]){ 
                p--; 
            }
            else{
                q--;
            }
        }   
         System.out.print("LCS of "+X+" And "+Y+" is ");
         for(int k=0;k<=store;k++){
         System.out.print(LcsFinal[k]);
         }
    }
    
    
    public static void main(String args[]){
        String X="ABEJ";
        String Y="AJBCE";
            int m=X.length();
        int n=Y.length();
        LCS(X,Y,m,n);
    }
}