public class consecSum {
    public static void main(String[] args) {
        System.out.println(sumUp(1, 7));
    }
    public static int sumUp(int numb, int limit){
        if(limit > 0){
            numb++;
            return sumUp(numb, limit - 1);
        }
        else return numb;
    }
}
