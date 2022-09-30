package com.javarush.task.task29.task2909.human;

public class UniversityPerson extends Human{
    //@Override
//    public University getUniversity() {
//        return university;
//    }

    private University university;
    public University getUniversity(){
        return university;
    }

    public void setUniversity(com.javarush.task.task29.task2909.human.University university) {
        this.university = university;
    }


    public UniversityPerson(String name, int age) {
        super(name, age);
    }}

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//
//    private List<Student> students = new ArrayList<>();
//}
