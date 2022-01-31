public class printHelloRecursive {
    public static void main(String[] args) {
        printHello("Hello", 5);
    }
    public static void printHello(String text, int times){
        // if(times <= 0)return;       //base case
        // System.out.println(text);       //print once
        // printHello(text, times - 1);        //call again but with 1 less printed
        if(times > 0){
            System.out.println(text);
            printHello(text, times - 1);
        }
        
    }
}
