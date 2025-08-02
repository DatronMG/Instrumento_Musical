
package Musica;


public class flauta extends instrumento_musical {
    private String sonido = "fufufufufufu\n";
    
       public void darMusica(){
       System.out.println("Flauta tocaaaaaaa\n");
       darCancion("https://www.youtube.com/watch?v=B_ftZXmu0-0&list=RDB_ftZXmu0-0&start_radio=1");
    }
   
   public String darSonido(){
       return sonido; 
   }
}

