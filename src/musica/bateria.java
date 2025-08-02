
package Musica;


public class bateria extends instrumento_musical {
    private String sonido = "pom pom\n";
       public void darMusica(){
       System.out.println("Bateria tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=j1WFyN_tE2E");
    }
   
   public String darSonido(){
       return sonido;
   }
}

