public class array {
    public static void main(String[] args) {
       int n=153;
       int rem,sum=0;
       int temp=n;
       while(n>0){
        rem=n%10;
        sum=sum+rem*rem*rem;
        n=n/10;
       }
       if(temp==sum){
        System.out.println("it is a armstrong number");
       }
       else{
        System.out.println("it is not a armstrong number");
       }
    }
}
