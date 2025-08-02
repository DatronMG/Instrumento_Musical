
package Musica;


public class trompeta extends instrumento_musical {
    
    private String sonido = "fififififififi\n";
    
       public void darMusica(){
       System.out.println("Trompeta tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=nSQ_Jtit0y0&list=RDnSQ_Jtit0y0&start_radio=1");
    }
   
   public String darSonido(){
       return sonido;
   }
}

