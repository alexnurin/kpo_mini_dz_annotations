import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.LOCAL_VARIABLE)
public @interface Cool {
    int coolenity() default 0;
}
