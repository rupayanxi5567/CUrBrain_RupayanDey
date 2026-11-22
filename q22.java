package week_6;

public class q22 {
    static void main() {
        int []a = {1,2,3,0,0,0};
        int []b = {2,5,6};

        int m=3;
        int n=3;

        mergeTwoSortedArrays(a,m,b,n);
    }

    private static void mergeTwoSortedArrays(int[] a, int m, int[] b, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while (i>=0 && j>=0){
            if(b[j]>a[i]){
                a[k] = b[j];
                j--;
            }else{
                a[k]=a[i];
                i--;
            }
            k--;
        }

        while (j>=0){
            a[k]=b[j];
            j--;
            k--;
        }

    }
}
