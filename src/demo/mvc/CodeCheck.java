package demo.mvc;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CodeCheckConstrainValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CodeCheck {

    public String codePrefix();

    public String message() default "Wrong code prefix";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
