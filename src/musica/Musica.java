
package Musica;
import java.util.Scanner;
public class Musica {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opc = 0, opc2 = 0, opc3 = 0;
        
        guitarra instrumento1 = new guitarra();   
        piano instrumento2 = new piano();
        bateria instrumento3 = new bateria();
        flauta instrumento4 = new flauta();
        trompeta instrumento5 = new trompeta();
        acordeon instrumento6 = new acordeon();
        bajo instrumento7 = new bajo();
        violin instrumento8 = new violin();
        
        do {
            System.out.println("\nEleje una opcion");
            System.out.println("1. Musica");
            System.out.println("2. Sonido");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                   System.out.println("\nEleje una opcion");
                   System.out.println("1. Guitarra");
                   System.out.println("2. Piano");
                   System.out.println("3. Bateria");
                   System.out.println("4. Flauta");
                   System.out.println("5. Trompeta");
                   System.out.println("6. Acordeon");
                   System.out.println("7. Bajo");
                   System.out.println("8. Violin\n");
                   opc2 = entrada.nextInt();
            switch (opc2){
                case 1:
                    instrumento1.darMusica();
                    break;
                case 2:
                    instrumento2.darMusica();
                    break;
                case 3:
                    instrumento3.darMusica();
                    break;
                case 4:
                    instrumento4.darMusica();
                    break;
                case 5:
                    instrumento5.darMusica();
                    break;
                case 6:
                    instrumento6.darMusica();
                    break;
                case 7:
                    instrumento7.darMusica();
                    break;
                case 8:
                    instrumento8.darMusica();
                    break;    
                default:
                    System.out.println("No sea pendejo");
                    break;
                }
                    break; 
                case 2:
                   System.out.println("\nEleje una opcion");
                   System.out.println("1. Guitarra");
                   System.out.println("2. Piano");
                   System.out.println("3. Bateria");
                   System.out.println("4. Flauta");
                   System.out.println("5. Trompeta");
                   System.out.println("6. Acordeon");
                   System.out.println("7. Bajo");
                   System.out.println("8. Violin\n");
                   opc3 = entrada.nextInt();
            switch (opc3){
                case 1:
                    System.out.println(instrumento1.darSonido());
                    break;
                case 2:
                    System.out.println(instrumento2.darSonido());
                    break;
                case 3:
                    System.out.println(instrumento3.darSonido());
                    break;
                case 4:
                    System.out.println(instrumento4.darSonido());
                    break;
                case 5:
                    System.out.println(instrumento5.darSonido());
                    break;
                case 6:
                    System.out.println(instrumento6.darSonido());
                    break;
                case 7:
                    System.out.println(instrumento7.darSonido());
                    break;
                case 8:
                    System.out.println(instrumento8.darSonido());
                    break;    
                default:
                    System.out.println("No sea pendejo");
                    break;
                }
                 break; 
                default:
                    System.out.println("No sea pendejo");
            }
        } while(opc!=3);
}
}
