
package Musica;


public class violin extends instrumento_musical {
       
    private String sonido = "flinflinflin\n";
    
       public void darMusica(){
       System.out.println("Violin tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=kwZu8vsJHBI&list=RDkwZu8vsJHBI&start_radio=1");
    }
   
       public String darSonido(){
       return sonido;
   }
}

