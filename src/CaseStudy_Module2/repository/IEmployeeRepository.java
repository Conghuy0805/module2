package CaseStudy_Module2.repository;

import CaseStudy_Module2.model.Employee;

import java.util.ArrayList;

public interface IEmployeeRepository {
    ArrayList<Employee> finAll();
    int getSize();
    ArrayList<Employee> writeFile(ArrayList<Employee> employees);
}
