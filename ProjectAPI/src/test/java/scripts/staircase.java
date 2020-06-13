package scripts;

public class staircase {

	public static void main(String[] args) {
		int i,k,j;
		int n=3;
		/*
		 * for(i=0;i<n;i++){
		 * 
		 * for(int j=0;j<n-i;j++){ System.out.print(" "); } for(int k=0;k<=i;k++)
		 * System.out.print("#"); System.out.print("\n"); System.out.print(' '); }
		 */
        
		for(i=0;i<n;i++){
	          
            for(j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
                System.out.print("#");
           System.out.println(); 
        }

        

	}

}
