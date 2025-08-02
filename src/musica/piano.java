
package Musica;

public class piano extends instrumento_musical {
    
    private String sonido = "pipipi\n";
    
       public void darMusica(){
       System.out.println("Piano tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=uZKYPdn-dKY&list=RDuZKYPdn-dKY&start_radio=1");
    }
   
   public String darSonido(){
       return sonido;
   }
}

