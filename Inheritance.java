import java.io.*;

class Employee {
    String Name;
    int Age;
    long Phoneno;
    double salary;
    String Address;

    public void printsalary() {
        System.out.println("Name::" + Name + " ,Age::" + Age + " ,Phoneno::" + Phoneno + ", salary::" + salary
                + " ,Address::" + Address);
    }
}

class Officer extends Employee {
    String Department;
    String Specialization;

    public void printOfficer() {
        System.out.println("Department:" + Department + " ,Specialization:" + Specialization);
    }
}

class Manager extends Employee {
    String Department;
    String Specialization;

    public void printManager() {
        System.out.println("Department:" + Department + " ,Specialization:" + Specialization);
    }
}

class Inheritance {
    public static void main(String[] args) {
        Officer p = new Officer();
        p.Name = "Arjun";
        p.Age = 23;
        p.salary = 25000.00;
        p.Phoneno = 9495429;
        p.Address = "Ernakulam";
        p.Department = "Marketting";
        p.Specialization = "Accountancy with Tally";
        System.out.println();
        System.out.println("///////// OFFICER DETAILS /////////");
        System.out.println();
        p.printsalary();
        p.printOfficer();
        Manager m = new Manager();
        m.Name = "Amal";
        m.Age = 32;
        m.salary = 29000.00;
        m.Phoneno = 9423149;
        m.Address = "Calicut";
        m.Department = "finance";
        m.Specialization = "Accountancy with Tally";
        System.out.println();
        System.out.println("///////// MANAGER DETAILS /////////");
        System.out.println();
        System.out.println();
        m.printsalary();
        m.printManager();
    }
}
