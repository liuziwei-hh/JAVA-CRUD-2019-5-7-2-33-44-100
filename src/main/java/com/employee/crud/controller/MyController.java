package com.employee.crud.controller;


import com.employee.crud.entity.Employee;
import com.employee.crud.exception.BusinessException;
import com.employee.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity getAllUser() {
        return new ResponseEntity<>(employeeService.getAllUser(), HttpStatus.OK);
    }

    @PostMapping("/{userId}")
    public ResponseEntity addUser(@RequestBody Employee user) {
        employeeService.addUser(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity updateUserById(@PathVariable int userId, @RequestBody Employee user) throws BusinessException {
        employeeService.updateUserById(userId, user);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUserById(@PathVariable int userId) throws BusinessException {
        employeeService.deleteUserById(userId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
