package JavaNangCao.JavaAdvancedLearn.Annotation.ValidationEngine;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequiredRole {
    String value() default "USER";
}
