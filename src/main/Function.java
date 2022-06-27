package main;

public class Function {
	public int calculateAge(int a[], int m[], int n, int p) {
		int x = 0;
	    
	    for(int i = 0; i<n; i++){
	      
	      int M = p/m[i], y = 0; // M1 = p/m1, M2 = p/m2 ....., Mn = p/mn
	      
	      for(int j=0; j<m[i]; j++){
	        if((M*j)%m[i]==1){
	          y = j; break; // Finding the values for y1, y2,..., yn
	        }
	      }
	      
	      x = x + a[i]*M*y; // x = a1*M1*y1 + a2*M2*y2 + ... + an*Mn*yn
	    }
	    
	    return x%p; 
	}
}
