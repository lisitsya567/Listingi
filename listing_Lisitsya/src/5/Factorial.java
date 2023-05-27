public class Factorial {
    long computeI(int n) {
        long result =1;

        for (int i=1; i<=n; i++)
            result *=i;

        return result;
    }
    long computeR(int n) {
        if (n==1) return n;
        return computeR(n-1) *n;
    }
}

class RecursionDemo {
    public static void main(String[] args) {

        Factoriaal f= new Factoriaal();

        System.out.println("Факториал, рассчитанный в цикле ");
        for (int i=6; i>0; i--) {
            System.out.println(i+ "!= " + f.computeI(i));
        }
        System.out.println("Факториал, рассчитанный с помощью рекурсии");
        for (int r=1; r<=6; r++) {
            System.out.println(r+ "!= " +f.computeR(r));
        }
    }
}
