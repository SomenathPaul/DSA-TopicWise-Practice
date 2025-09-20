public class Sum_of_n_natural_number {
    public static void SumofNumb(int i, int n, int sum) {
        if(i==n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        SumofNumb(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Sum of first " + n + " natural numbers is: ");
        SumofNumb(1,n,0);
    }
}