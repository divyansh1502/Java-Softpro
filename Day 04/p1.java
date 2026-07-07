
public class p1 {
    public static void main(String[] args) throws InterruptedException{
        int c = 10;
        do {
            System.out.println(c);
            Thread.sleep(1000);
            c--;
        } 
        while(c > 0);
    }    
}
