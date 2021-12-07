package com.company.oop.inheritence;

public class Test {
    public static void main(String[] args) {
        Manager saad = new Manager("saad","1243255",300f,"IT");
        HR hr1 = new HR("mohamed morsy","3223",3000f);
        hr1.bonus=123;
        hr1.address="Cairo";
        hr1.subDepartment = "dep1";
        //hr1.setName("saleeh");
        System.out.println(hr1.getName());
    }
}
