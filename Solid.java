public class Solid {
    public static void main(String[] args)
    {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<4+4-1;j++){
                if(j>n/2-i && j<=n+n/2-i)
                System.out.print("*");
                else
                System.out.print(" ");
                
            }
            
            System.out.println(" ");
    
        }
    }
    
}
