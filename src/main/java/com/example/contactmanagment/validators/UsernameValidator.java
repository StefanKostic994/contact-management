package com.example.contactmanagment.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class UsernameValidator implements ConstraintValidator<Username, String> {

    private static final String PATTERN = "^[a-zA-Z0-9_-]{8,20}$";

    @Override
    public void initialize(Username constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        // username must have at least 8 characters and at least one number
        return username.matches(PATTERN);
    }
}
