
import com.mycompany.smfra.ServletExamen;
import com.mycompany.smfra.evaluacion;


public class TestExamen {

   
    public static void main(String[] args) {
         ApplicationContext cts=new 
                
    AnnotationConfigApplicationContext(ServletExamen.class);
     evaluacion a=cts.getBean(evaluacion.class);
     a.setNombre("sandra");
     a.setCalificacion(8);
     System.out.println(a.getCalificacion());
        System.out.println(a.getNombre());
    
    
  
      
    }

    private static class ApplicationContext {

        public ApplicationContext() {
        }

        private evaluacion getBean(Class<evaluacion> aClass) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class AnnotationConfigApplicationContext extends ApplicationContext {

        public AnnotationConfigApplicationContext(Class<ServletExamen> aClass) {
        }
    }
    
}
