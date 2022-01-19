package com.example.SpringbBoot.controller;

import com.example.SpringbBoot.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController
{
    ArrayList<Student> studentArrayList=new ArrayList<>();
    //Create
    @RequestMapping("/add_student")
    public String addstudent()
    {
        Student s1=new Student("Rocky",32,"IT");
        studentArrayList.add(s1);
        return "Added Successfully";
    }
    //Read
    @RequestMapping("/get_student")
    public ArrayList<Student> getStudentArrayList()
    {
        return studentArrayList;
    }
    //update
    @RequestMapping("/update_student")
    public String update(@RequestParam String name,@RequestParam int index)
    {
       studentArrayList.get(index).setName(name);
       return "Update Succesfully";
    }
    //Delete
    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index)
    {
        studentArrayList.remove(index);
        return "Delete successfully";
    }
}
