package pt.gapiap.proccess.validation.bean.checker;

import pt.gapiap.errors.ErrorArea;

import java.util.List;

interface Validator {
    Class<?> getValidatorClass();

    ErrorArea getErrorArea();

    List<ValidationMethodChecker> getValidationList();

    String getJsonTemplate(int code, String language);
}
