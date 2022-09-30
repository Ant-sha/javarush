package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private int age;
    private  String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public University(List<Student> students, int age, String name) {
//        this.students = students;
//        this.age = age;
//        this.name = name;
//    }

    public Student getStudentWithAverageGrade(double averGrade) {
        Student student = null;
        for (Student averageStudent : students){
            if(averageStudent.getAverageGrade()==averGrade){
                student=averageStudent;}}

                return student;
    }

    public Student getStudentWithMaxAverageGrade() {
        ArrayList<Double> arrayList =new ArrayList<>();
        for(Student averageStudent : students){
            arrayList.add(averageStudent.getAverageGrade());}
        Collections.sort(arrayList);
        double averGradeMax =arrayList.get(arrayList.size()-1);
        Student studentMax=null;
        for(Student averageStudent : students) {
            if (averageStudent.getAverageGrade()==averGradeMax){
                studentMax=averageStudent;}
            }
        return studentMax;}


        //TODO:


    public Student getStudentWithMinAverageGrade( ) {
        //TODO:
        ArrayList<Double> arrayList=new ArrayList<>();
        for(Student averageStudent : students){
            arrayList.add(averageStudent.getAverageGrade());}
        Collections.sort(arrayList);
        double averGradeMax = arrayList.get(0);

        Student studentMin=null;
        for(Student averageStudent : students){
            if (averageStudent.getAverageGrade()==averGradeMax){
                studentMin=averageStudent;}
            }
    return studentMin;
    }


        public void expel (Student student){
            students.remove(student);
        }


    }



