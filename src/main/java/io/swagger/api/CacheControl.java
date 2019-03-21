package io.swagger.api;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD )
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheControl {
   String value() default "no-cache";
}