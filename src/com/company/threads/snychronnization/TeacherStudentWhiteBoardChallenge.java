/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 12/3/21, 6:38 PM.                             -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads.snychronnization;
class WhiteBoard{
    String  text;
    public void write(String text){
        this.text = text;
    }
    public String read(){
        return text;
    }

}
class Teacher extends Thread{
    WhiteBoard whiteBoard;
    Teacher(WhiteBoard whiteBoard){
        this.whiteBoard=whiteBoard;
    }
    @Override
    public void run(){
        whiteBoard.write("first statement");
    }
}
class Student extends Thread{
    WhiteBoard whiteBoard;
    Student(WhiteBoard whiteBoard){
        this.whiteBoard=whiteBoard;
    }
    @Override
    public void run(){
       String text= whiteBoard.read();
        System.out.println("Student read" + text);
    }
}
public class TeacherStudentWhiteBoardChallenge {
    WhiteBoard whiteBoard = new WhiteBoard();
    Teacher teacher = new Teacher(whiteBoard);
    Student student1 = new Student(whiteBoard);
    Student student2 = new Student(whiteBoard);
    Student student3 = new Student(whiteBoard);

}
