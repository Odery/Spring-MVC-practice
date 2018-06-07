package demo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeCheckConstrainValidator implements ConstraintValidator<CodeCheck, String> {

    private String codePrefix;

    @Override
    public void initialize(CodeCheck constraintAnnotation) {
        codePrefix = constraintAnnotation.codePrefix();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.startsWith(codePrefix);
    }
}
