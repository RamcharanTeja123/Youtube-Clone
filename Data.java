
public class Data {
    public static void main(String[] args) {
int[] arr={13,60,44,16,12,55,64,72,18,35};
int[] arr2=new int[arr.length];
int[] arr3=new int[arr.length];
int evenIndex=0;
int oddIndex=0;
for(int i=0;i<arr.length;i++){
  if(arr[i]%2==0){
  arr2[evenIndex++]=arr[i];

}else{

  arr3[oddIndex++]=arr[i];
}
}
System.out.println("array1:");
for(int num:arr){
  System.out.print(num+" ");
}
System.out.println(" \n array2:");
for(int i=0;i<evenIndex;i++){
  System.out.print(arr2[i]+" ");
}
System.out.println("\n array3:");
for(int i=0;i<oddIndex;i++){
  System.out.print(arr3[i]+" ");
}
    }
}
    

