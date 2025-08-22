public class Diamond {
    public static void main(String[] args){
        int n1=5;
        int n=2*n1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i<=n/2-1)
                if(j<=n/2-1-i || j>=n/2+i)
                System.out.print("*");
            else
            System.out.print(" ");
            if(i>=n/2)
            if(j<=i-n/2 || j>=n+n/2-i-1)
            System.out.print("*");
            else
            System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    
}
