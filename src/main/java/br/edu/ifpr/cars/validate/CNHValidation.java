package br.edu.ifpr.cars.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CNHValidation implements ConstraintValidator<CNH, String>{
    
    @Override
    public boolean isValid(String text, ConstraintValidatorContext context) {
        return text.matches("\\d{11}");
    }

}