package com.employee.crud.data;

import com.employee.crud.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> userData() {
        List<Employee> userList = new ArrayList<>();
        Employee userOne = new Employee(0, "小明", 20, "男");
        Employee userTwo = new Employee(1, "小红", 19, "女");
        Employee userThree = new Employee(2, "小智", 15, "男");
        Employee userFour = new Employee(3, "小钢", 16, "女");
        Employee userFive = new Employee(4, "小夏", 15, "女");
        userList.add(userOne);
        userList.add(userTwo);
        userList.add(userThree);
        userList.add(userFour);
        userList.add(userFive);
        return userList;
    }
}
