package com.javarush.task.task29.task2909.human;

import java.util.Date;

public class Student extends UniversityPerson{
    private int course;
    private double averageGrade;

    private Date beginningOfSession;
    private Date endOfSession;

    public Student(String name, int age, double averageGrade) {
        super(name,age);

        this.averageGrade = averageGrade;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    //public String getUniversity() {
      //  return university;
    //}

//    public void setUniversity(String university) {
//        this.university = university;
//    }

    @Override
    public String getPosition() {
        return "Студент";
    }

//    public void printData() {
//        System.out.println("Студент: " + name);
//    }


    /*public void incAverageGradeBy01() {
        averageGrade += 0.1;
    }

    public void incAverageGradeBy02() {
        averageGrade += 0.2;
    }*/

    public void incAverageGrade(double delta){
        setAverageGrade(getAverageGrade()+delta);
    }

   /* public void setValue(String name, double value) {
        if (name.equals("averageGrade")) {
            averageGrade = value;
            return;
        }
        if (name.equals("course")) {
            course = (int) value;
            return;
        }
    }*/
   public void setCourse (int value) {
       course = value;
       return;
   }

    public void setAverageGrade (double value) {
        averageGrade = value;

        }

    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}