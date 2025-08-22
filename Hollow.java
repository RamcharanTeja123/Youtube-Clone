public class Hollow  {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n+n-i;j++)
           {
             if(i==0 || i==3)
             if(j>n/2-i && j<=n+n/2-i)
             System.out.print("*");
             else
             System.out.print(" ");
             if(i>0 && i<3)
             if(j==n/2+1-i || j==n+n/2-i)
             System.out.print("*");
             else
             System.out.print(" ");
            }
          System.out.println(" ");
        }
    }
}
