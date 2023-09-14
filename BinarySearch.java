import java.util.*;
class BinarySearch{

    static int binarySearch(int arr[],int n,int x){
        int low,mid,high;
        low=0;
        high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]==x){
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter the no. of elements:");
        int n=ip.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+i+"] :" );
            arr[i]=ip.nextInt();
        }
        System.out.print("Enter the searching element :");
        int x=ip.nextInt();
        int k=binarySearch(arr, n,x);
        if(k==-1){
            System.out.println("Element NOT found");
        }
        else{
            System.out.println("Element found at location :"+k);
        }
    }
}