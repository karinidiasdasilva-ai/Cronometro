import java.Time.*;
import java.util.*;

 public class Cronometro {
    public static void main (String[] args) {
        int contador = 0;
        while (true)  {
            int horaAtual = LocalDateTime.now().getHour();
            int minutoAtual = LocalDateTime.now().getMinute();
            int segundoAtual = LocalDateTime.now().getSecond();
            System.out.println( + ("horaAtual + ":" + minutoAtual + ":" + segundoAtual"));
            try {
                 Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Erro: " + e);
                }
                try {
                    if (System.getProperty("os.name").contains("Windows")) {
                        new ProcessBuilder("cmd","/c","cls").inheritIO().start().
                            waitFor();
                    } else {
                        System.out.println("\033[H\00332J]");
                        System.out.flush();
                    }
                } catch(Exception e) {
                    System.out.println("Erro: + e");
                }
                contador++;
            }       
        }
    }    
