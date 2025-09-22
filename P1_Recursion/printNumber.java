public class printNumber {
    public static void printNumAscending(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumAscending(n-1);
    }   
    public static void printNumDescending(int k, int n) {
        if(k==n+1){
            return;
        }
        System.out.println(k);
        printNumDescending(k+1,n);
    }   
    public static void main(String[] args) {
        int n = 10;
        int k = 1;
        printNumAscending(n);
        System.out.println("------------------");
        printNumDescending(k,n);
    }
}
