package Projects.ClassAndObjectLab.TelevisionAnnotations;
import java.lang.annotation.*;;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface VolumeLimiter {
    int min() default 0;
    int max() default 100;
}
