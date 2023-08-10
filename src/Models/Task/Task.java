/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Task;

import Models.Entity;
import Models.Members.Member;

/**
 *
 * @author Student
 */
public class Task implements Entity{
    private int num;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private boolean completed;
    private Member resposable;

    public Task(int num,String name, String description, String startDate, String endDate, Member resposable) {
        this.num = num;
        this.name = "";
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = false;
        this.resposable = resposable;
    }

    public Task(int num, String name, String description, String startDate, String endDate) {
        this.num = num;
        this.name = "";
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = false;
        this.resposable = null;
    }

    public Task(int num) {
        this.num = num;
        this.description = "";
        this.startDate = "";
        this.endDate = "";
        this.completed = false;
        this.resposable = null;
    }

    public int getNum() {
        return num;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Member getResposable() {
        return resposable;
    }

    public void setResposable(Member resposable) {
        this.resposable = resposable;
    }
    
    @Override
    public boolean isComplete() {   
       return this.num==0 && !this.name.equals("") && !this.description.equals("") && !this.startDate.equals("") && !this.endDate.equals("");
    }

    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.num, this.name, this.description, this.startDate, this.endDate, this.completed, this.resposable};
    }
    
    public boolean complete() {
        return this.completed = true;
    }
}
