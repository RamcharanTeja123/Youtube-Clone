public class Swan {
    public static void main(String[] args){
        int n=1;
        char c='A';
        for(int i=1;i<=6;i++){
            if(i%1==0){
            System.out.print(n+" ");
            n++;
        }
            else if(i%2==0)
            System.out.print(c+" ");
            c++;
        }
    }
    
}
