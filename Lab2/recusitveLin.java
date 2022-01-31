package Lab2;


public class recusitveLin {
    public static void main(String[] args) {
        int list[] = {1,2,3,4};
        int key = 5;
        System.out.println(recursiveLinearSearch(list, key, 0));
    }
    public static int recursiveLinearSearch(int list[], int key, int index){
        if(list[index] == key){
            return index;
        }
        else if(index + 1 < list.length)return recursiveLinearSearch(list, key, index + 1);
        else return -1;
    }
}

