import javax.imageio.IIOException;
import java.io.IOException;

public class Shutdown {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("shutdown /s /t 1");

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
