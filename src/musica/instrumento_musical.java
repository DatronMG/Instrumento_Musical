
package Musica;
import java.awt.Desktop;
import java.net.URI;

public class instrumento_musical {
    
    private String sonido;
    
    public void darCancion(String url){
        try {
            Desktop.getDesktop().browse(new URI(url));
        }
        catch (Exception e){
             System.out.println("No se pudo escuchar");
        }
    }
    
    public void darMusica(){
    }
    
    public String darSonido (){  
        return "";
    }
    
    
    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    } 
    
}
