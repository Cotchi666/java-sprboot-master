package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Tồn tại trong lúc chạy chương trình
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface JsonName {
    String value();
}