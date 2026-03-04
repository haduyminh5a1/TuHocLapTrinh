package JavaNangCao.JavaAdvancedLearn.StringLengthValidation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Length{
    int min() default 0;
    int max() default 255;
}
