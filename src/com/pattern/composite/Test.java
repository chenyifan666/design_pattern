package com.pattern.composite;

public class Test {
    public static void main(String[] args) {
        Company company =new ConcreteCpmpany("总公司");
        Company hrDepartment = new HRDepartment("人事部");
        Company financeDepartment = new FinanceDepartment("财务部");
        company.add(hrDepartment);
        company.add(financeDepartment);
        company.display(1);
        Company hebeihr = new HRDepartment("河北人事部");
        hrDepartment.add(hebeihr);
        company.display(1);
    }
}
