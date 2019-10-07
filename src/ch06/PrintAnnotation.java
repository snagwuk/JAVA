package ch06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})   //적용할 타겟 설정
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation
{
    String value() default "-";
    int number() default 15;

}
