package br.edu.ifpr.cars.validate;

import java.util.ArrayList;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SemOfensasValidation implements ConstraintValidator<SemOfensas, String> {

    @Override
    public boolean isValid(String text, ConstraintValidatorContext context) {

        ArrayList palavrasProibidas = new ArrayList<>();
        palavrasProibidas.add("idiota");
        palavrasProibidas.add("burro");
        palavrasProibidas.add("lixo");
        palavrasProibidas.add("desgraçado");
        palavrasProibidas.add("matar");
        palavrasProibidas.add("gordo");

        for (Object palavra : palavrasProibidas) {
            if (text != null && text.toLowerCase().contains(((String) palavra).toLowerCase())) {
                return false;
            }
        }

        return true;
    }

}