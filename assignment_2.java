public class assignment_2 {
    static int count_prime=0;
    static int count_even=0;
    static int range = 10000;
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable_even=()->{
            for (int j = 1; j <= range; j++) {
                if(j%2 == 0){
                    count_even += 1;
                }
            }
            System.out.println("Total number of even numbers are : "+count_even);
        };
        Runnable runnable_prime=()->{
            for (int num = 2; num <= range; num++) {
                boolean flag = false;
                for (int i = 2; i <= num / 2; ++i) {
                    // condition for nonprime number
                    if (num % i == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    count_prime += 1;
                }
            }
            System.out.println("Total number of prime numbers are : "+count_prime);
        };
        // Running the threads
        new Thread(runnable_even).start();
        new Thread(runnable_prime).start();
    }
}
