package scripts;

public class minmax {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,5};
		int n = 0,min=0,a,x;
		int m=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            	if(j!=i) 
                max=max+arr[j];
            }
            if(i==1)
            n=max;
            else
            	if(n>max)
            		n=max;
            if(m<max)
        		m=max;
            	max=0;
            	
        }
       
        System.out.print(n+" "+m);

	}

}
