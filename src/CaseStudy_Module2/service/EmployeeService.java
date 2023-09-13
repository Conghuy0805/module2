package CaseStudy_Module2.service;

import CaseStudy_Module2.validation.Validate;

public class EmployeeService{
    private Validate validate = new Validate();
    public void add() {
        String email = validate.email();

    }
}
