package Veric.SkyPro;

public class Main {

    static Employee[] employees = new Employee[10];
    static int cycleLength = employees.length-1;
    public static void printAllEmployees() {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void printFullNameAllEmployees() {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static float sumSalaryMonth() {
        float sum = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                sum +=employees[i].getSalaryMonth();
            }
        }
        return sum;
    }

    public static float minSalaryMonth() {
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

    public static float maxSalaryMonth() {
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

    public static int countEmployees() {
        int count = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static float averageSalaryMonth() {
        int count = 1;
        if (countEmployees() > count) {
            count = countEmployees();
        }
        return sumSalaryMonth() / count;
    }

    public static float sumSalaryMonth(String depart) {
        float sum = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                sum +=employees[i].getSalaryMonth();
            }
        }
        return sum;
    }

    public static float minSalaryMonth(String depart) {
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

    public static float maxSalaryMonth(String depart) {
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

    public static int countEmployees(String depart) {
        int count = 0;
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                count++;
            }
        }
        return count;
    }

    public static float averageSalaryMonth(String depart) {
        int count = 1;
        if (countEmployees(depart) > count) {
            count = countEmployees(depart);
        }
        return sumSalaryMonth(depart) / count;
    }

    public static void toIndexSalaryMonth(float procent) {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null) {
                employees[i].setSalaryMonth(employees[i].getSalaryMonth() * procent);
            }
        }
    }

    public static void toIndexSalaryMonth(String depart, float procent) {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                employees[i].setSalaryMonth(employees[i].getSalaryMonth() * procent);
            }
        }
    }

    public static void printAllEmployees(String depart) {
        for (int i = cycleLength; i >= 0 ; i--) {
            if (employees[i] != null && employees[i].getDepartment() == depart) {
                System.out.println(employees[i].toString(depart));
            }
        }
    }

    public static void printLessSalaryMonth(float sum) {
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i] != null && employees[i].getSalaryMonth() < sum) {
                System.out.println(employees[i].getId() + ": ");
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void printEqMaxSalaryMonth(float sum) {
        for (int i = cycleLength; i >= 0; i--) {
            if (employees[i] != null && employees[i].getSalaryMonth() >= sum) {
                System.out.println(employees[i].getId() + ": ");
                System.out.println(employees[i].toString());
            }
        }
    }


    public static void main(String[] args) {
        EmployeeBook book1 = new EmployeeBook();
        book1.addEmployee("John", "J.", "Connor", "Monetary", 50000);
        book1.addEmployee("Samanta", "S.", "Fox", "Monetary", 40000);
        book1.addEmployee("Jack", "Elton", "Bresenham", "IT", 80000);
        book1.addEmployee("Bjarne", "F.", "Stroustrup", "IT", 85000);
        book1.listEmployeeToDepartment();
    }
}
