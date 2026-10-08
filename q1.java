package week_1;

public class q1 {
    static void main(String[] args) {
        int n=-789780;
        if(n==0){
            System.out.println(1);
            return;
        }
        if(n<0){
            n=-1*n;
        }
        int counter=0;
        while (n>0){
            counter++;
            n=n/10;
        }
        System.out.println(counter);
    }
}
