
package Musica;

 
public class guitarra extends instrumento_musical {
   private String sonido = "shshsshshsh\n";
   public void darMusica(){
       System.out.println("Guitarra tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=gTptPPSGM3U&list=RDgTptPPSGM3U&start_radio=1");
    }
   
   @Override
   public String darSonido(){
       return sonido;
   }
}
