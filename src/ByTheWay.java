import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ByTheWay {
    String name() default "Alexnurin";
    String data() default "03-27-2023";
    int age();
}
