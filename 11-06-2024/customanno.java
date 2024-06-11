import java.lang.reflect.Method;
 
@interface myannotation {
    String value();
}
 
public class customanno {
    @myannotation("custom annotation")
    public void annmethod() {
        System.out.println("This is an annotated method");
    }
 
    public static void main(String[] args) throws Exception {
        customanno obj = new customanno();
        obj.annmethod();
        Method method = obj.getClass().getMethod("annmethod");
        myannotation ann = method.getAnnotation(myannotation.class);
        System.out.println("annotation value: " + ann.value());
    }
}