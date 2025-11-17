package br.edu.ifpr.cars.validate;

import java.time.LocalDate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AnoCarroValidation implements ConstraintValidator<AnoCarro, Number>{
    
    @Override
    public boolean isValid(Number number, ConstraintValidatorContext context) {

        int year = number.intValue();
        return !(year > LocalDate.now().getYear() || year < 1886);
    }

}