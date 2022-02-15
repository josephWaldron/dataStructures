package generics.Lab3.quiz1;

public class recusion1 {
    public static void main(String[] args) {
        System.out.println(fRecursive(32));
        System.out.println(f(32));
    }
    public static int fRecursive(int n) {
        if(n == 0){
            return 0;
        }
        else{
            return n += fRecursive(n - 1);
        }
    }
    public static int f(int N)
    {
     int count, sum = 0;
     for (count = 0; count <= N; count++)
     sum = sum + count;
     return sum;
    } 
}

