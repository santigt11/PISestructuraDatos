package prepis;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class PrePis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate aa = LocalDate.now();
        Field atributte;
        System.out.println(aa.getClass());
    }
    
}
