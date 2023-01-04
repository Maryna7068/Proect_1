public class Bank {
    public static int withdraw(int n) {
        int x = 1;
        int result = 1;
        while (x < n) {
            if (n%x==0){
            result = x;
        }
        x = x + 1;
    }
    return result;
}
public static int counter(int n) {
    int counter = 0;
    while (n!= 0){ ;
        counter = counter + 1;
        n = n - Bank.withdraw(n);
    }
    return counter;
}


        public static void main(String[] args) {
        System.out.println(Bank.counter(21));
    }
}
