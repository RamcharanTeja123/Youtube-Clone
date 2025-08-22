public class Right {
    public static void main(String[] args)
    {
        int n=9;
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++){
            if(i==n/2)
            System.out.print("*");
            if(i<n/2)
            if(j==n/2+i)
            System.out.print("*");
            else
            System.out.print(" ");
            if(i>n/2)
            if(j==n+n/2-i-1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println("");
    }
    }
    
}
