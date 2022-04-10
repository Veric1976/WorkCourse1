package Veric.SkyPro;

import java.util.Objects;

public class Employee {

    static int idEmployee = 1;

    private String firstName;
    private String middleName;
    private String lastName;
    private String department;
    private float salaryMonth;
    private int id = 0;

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + ' ' + middleName + ' ' + lastName;
    }
    public String getDepartment() {
        return department;
    }
    public float getSalaryMonth() {
        return salaryMonth;
    }
    public int getId() {
        return id;
    }

    public void setFirstName(String firstN) {
        firstName = firstN;
    }
    public void setMiddleName(String middleN) {
        middleName = middleN;
    }
    public void setLastName(String lastN) {
        lastName = lastN;
    }
    public void setDepartment(String depart) {
        department = depart;
    }
    public void setSalaryMonth(float salaryM) {
        salaryMonth = salaryM;
    }
    public void resetId () {
        id = 0;
    }

    public Employee(String firstN, String middleN, String lastN,String depart, float salaryM) {
           firstName = firstN;
           middleName = middleN;
           lastName = lastN;
           department = depart;
           salaryMonth = salaryM;
           id = idEmployee;
           idEmployee++;
    }

    @Override
    public String toString() {
        return  "Ф.И.О.: " +
                lastName + ' ' +
                firstName + ' ' +
                middleName +
                ", Отдел: " +
                department +
                ", ЗП = " +
                salaryMonth;
    }
    public String toString(String depart) {
        return  "Ф.И.О.: " +
                lastName + ' ' +
                firstName + ' ' +
                middleName +
                ", ЗП = " +
                salaryMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && middleName.equals(employee.middleName) && lastName.equals(employee.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department);
    }
}
