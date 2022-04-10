package Veric.SkyPro;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];
    private int cycleLength = employees.length-1;
    public void printAllEmployees() {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public void printFullNameAllEmployees() {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public float sumSalaryMonth() {
        float sum = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                sum +=employees[i].getSalaryMonth();
            }
        }
        return sum;
    }

    public float minSalaryMonth() {
        float minSalaryMonth = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                minSalaryMonth = employees[i].getSalaryMonth();
                break;
            }
        }
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                if (employees[i].getSalaryMonth() < minSalaryMonth) {
                    minSalaryMonth = employees[i].getSalaryMonth();
                }
            }
        }
        return minSalaryMonth;
    }

    public float maxSalaryMonth() {
        float maxSalaryMonth = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                maxSalaryMonth = employees[i].getSalaryMonth();
                break;
            }
        }
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                if (employees[i].getSalaryMonth() > maxSalaryMonth) {
                    maxSalaryMonth = employees[i].getSalaryMonth();
                }
            }
        }
        return maxSalaryMonth;
    }

    public int countEmployees() {
        int count = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                count++;
            }
        }
        return count;
    }

    public float averageSalaryMonth() {
        int count = 1;
        if (countEmployees() > count) {
            count = countEmployees();
        }
        return sumSalaryMonth() / count;
    }

    public float sumSalaryMonth(String depart) {
        float sum = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                sum +=employees[i].getSalaryMonth();
            }
        }
        return sum;
    }

    public float minSalaryMonth(String depart) {
        float minSalaryMonth = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                minSalaryMonth = employees[i].getSalaryMonth();
                break;
            }
        }
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                if (employees[i].getSalaryMonth() < minSalaryMonth) {
                    minSalaryMonth = employees[i].getSalaryMonth();
                }
            }
        }
        return minSalaryMonth;
    }

    public float maxSalaryMonth(String depart) {
        float maxSalaryMonth = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                maxSalaryMonth = employees[i].getSalaryMonth();
                break;
            }
        }
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                if (employees[i].getSalaryMonth() > maxSalaryMonth) {
                    maxSalaryMonth = employees[i].getSalaryMonth();
                }
            }
        }
        return maxSalaryMonth;
    }

    public int countEmployees(String depart) {
        int count = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                count++;
            }
        }
        return count;
    }

    public float averageSalaryMonth(String depart) {
        int count = 1;
        if (countEmployees(depart) > count) {
            count = countEmployees(depart);
        }
        return sumSalaryMonth(depart) / count;
    }

    public void toIndexSalaryMonth(float procent) {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                employees[i].setSalaryMonth(employees[i].getSalaryMonth() * procent);
            }
        }
    }

    public void toIndexSalaryMonth(String depart, float procent) {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                employees[i].setSalaryMonth(employees[i].getSalaryMonth() * procent);
            }
        }
    }

    public void printAllEmployees(String depart) {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                System.out.println(employees[i].toString(depart));
            }
        }
    }

    public void printLessSalaryMonth(float sum) {
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i] != null && employees[i].getSalaryMonth() < sum) {
                System.out.println(employees[i].getId() + ": ");
                System.out.println(employees[i].toString());
            }
        }
    }

    public void printEqMaxSalaryMonth(float sum) {
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i] != null && employees[i].getSalaryMonth() >= sum) {
                System.out.println(employees[i].getId() + ": ");
                System.out.println(employees[i].toString());
            }
        }
    }

    public void addEmployee(String firstN, String middleN, String lastN, String depart, float salaryM) {
        Employee e = new Employee( firstN, middleN, lastN, depart, salaryM);
        boolean addTrue = false;
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i] == null || employees[i].getId() == 0) {
                addTrue= true;
            }
        }
        if (addTrue) {
            for (int i = cycleLength; i >= 0; i--) {
                if (employees[i] == null) {
                    employees[i] = new Employee(firstN, middleN, lastN, depart, salaryM);
                    break;
                } else if (employees[i].getId() == 0) {
                    employees[i].setFirstName(firstN);
                    employees[i].setMiddleName(middleN);
                    employees[i].setLastName(lastN);
                    employees[i].setDepartment(depart);
                    employees[i].setSalaryMonth(salaryM);
                    break;
                }
            }
        } else {
            System.out.println("Штат сотрудников фирмы полон, невозможно добавить нового сотрудника");
        }
    }

    public void deleteEmployee(String firstN, String middleN, String lastN, String depart) {
        Employee e = new Employee( firstN, middleN, lastN, depart, 0);
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i].equals(e)) {
                employees[i].resetId();
                employees[i].setFirstName("");
                employees[i].setMiddleName("");
                employees[i].setLastName("");
                employees[i].setDepartment("");
                employees[i].setSalaryMonth(0);
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i].getId() == id) {
                employees[i].resetId();
                employees[i].setFirstName("");
                employees[i].setMiddleName("");
                employees[i].setLastName("");
                employees[i].setDepartment("");
                employees[i].setSalaryMonth(0);
            }
        }
    }

    public void changeEmployee(String firstN, String middleN, String lastN, String depart, float salaryM) {
        Employee e = new Employee(firstN, middleN, lastN, depart, 0);
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i].equals(e) ) {
                if (employees[i].getDepartment() == depart) {
                    employees[i].setSalaryMonth(salaryM);
                } else {
                    employees[i].setDepartment(depart);
                    employees[i].setSalaryMonth(salaryM);
                }
            }
        }
    }

    public void listEmployeeToDepartment() {
        String[] s = new String[employees.length];
        int countDepartment = 0;
        boolean uniqueDepartment;
        for (int i = cycleLength; i >= 0; i--) {
                if (employees[i] != null && employees[i].getId() != 0) {
                    uniqueDepartment = true;
                    for (int j = s.length-1; j >= 0; j--) {
                        if (employees[i].getDepartment().equals(s[j])) {
                            uniqueDepartment = false;
                            break;
                        }
                    }
                    if (uniqueDepartment) {
                        s[countDepartment] = employees[i].getDepartment();
                        countDepartment++;
                    }
                }
            }
        for (int j = countDepartment; j > 0; j--) {
            System.out.println("------------------------");
            System.out.println("Отдел: " + s[j - 1]);
            System.out.println("Сотрудники:");
            for (int i = cycleLength; i >= 0; i--) {
                if (employees[i] != null && employees[i].getId() != 0) {
                    if (employees[i].getDepartment().equals(s[j - 1])) {
                        System.out.println(employees[i].toString(s[j - 1]));
                    }
                }
            }
        }

    }

    }
