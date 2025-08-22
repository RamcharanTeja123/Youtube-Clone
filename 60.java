
class Test{
    public static void main(String[] args){
        int n=25;
        for(int i=2;i<=n;i++){
        boolean flag=true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                flag=false;
            }
        }
    
        if(flag==true){
            System.out.println(i+" ");
        }
        
        }
    }
}


