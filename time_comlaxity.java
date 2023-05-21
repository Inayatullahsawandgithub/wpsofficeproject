public class time_comlaxity {

    // public int findSum(int n){

    //  return n*(n+1)/2;
    public int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        time_comlaxity demo = new time_comlaxity();
        System.out.println(demo.findSum(99999));
        System.out.println("time taken " + System.currentTimeMillis() + " millisecond");
    }
}