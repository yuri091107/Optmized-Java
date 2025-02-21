
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = sc.nextInt();
        sc.close();

        if(numero <= 230) {
            try {
                FileWriter fw = new FileWriter("teste.txt");
                BufferedWriter bw = new BufferedWriter(fw);
    
                for(int i= 0; i < numero; i++) {
                    bw.write("]P<+/s5[<CiPZ?AZyW>px(V5Dde=68mu+81)Scbm\"=BDdkFkF$lk!O=A<g;?FjKip;kDLn<;-{\"'xbX_$Ow{[7eB@gRG+(b&2`\n");
                    bw.flush();
                
                }
                bw.close();
                fw.close();
                
            } catch(IOException e) {
                System.out.println("Não foi possível escrever o arquivo");
             }
             long memoria = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
             System.out.println(memoria);
        }

        else if(numero > 230) {
            System.out.println("Não foi possível armazenar este dado!");
        }
    }
}