package Arrays;

public class ArrayAdding {
    public static void main(String[] args) {
        int arr1[]={9,9,9};
        int n= arr1.length;

        int arr2[]={2,8};
        int m= arr2.length;
        int []sum=new int[n>m?n:m];
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=sum.length-1;
        while(k>=0){
            int d=carry;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            carry=d/10;
            d=d%10;
            sum[k]=d;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int val:sum){
            System.out.println(val);
        }

    }
}
