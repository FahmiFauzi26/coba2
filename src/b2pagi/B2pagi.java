package b2pagi;
import java.util.Scanner;
public class B2pagi {
    public static void main(String[] args) {
         Scanner b = new Scanner(System.in);
        String Masukan;
       
        System.out.println("Masukan Kode diskon anda: ");
        Masukan = b.next();
        
        switch (Masukan){
            case "11241aa" :
                   System.out.println("Anda mendapat diskon 10% ");
                   break;
            case "15461xx" :
                System.out.println("Anda mendapat diskon 5% ");
                break;
                        default : 
                            System.out.println("Kode diskon salah");
                            
            
        }
    }
    
}