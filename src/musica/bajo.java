
package Musica;


public class bajo extends instrumento_musical {
    
    private String sonido = "pan pan pan\n";
    
       public void darMusica(){
       System.out.println("Bajo tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=rY0WxgSXdEE&list=RDrY0WxgSXdEE&start_radio=1");
    }
   
       public String darSonido(){
       return sonido;
   }
}

