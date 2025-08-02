
package Musica;

public class acordeon extends instrumento_musical {
    
    private String sonido = "sasasasasasas\n"; 
    
       public void darMusica(){
       System.out.println("Acordeon tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=nxXvOEPsE0s&list=RDnxXvOEPsE0s&start_radio=1");
    }
   
   public String darSonido(){
       return sonido;
   }
}

