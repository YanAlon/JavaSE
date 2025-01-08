package com.javasead.day01oop;

public class Object02ConstructorStudent extends Object02ConstructorPerson{
    private int score;
    public Object02ConstructorStudent() {}
    public Object02ConstructorStudent(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Object02ConstructorStudent stu =
                new Object02ConstructorStudent("Joe", 25, 45);
        stu.show();
    }
}
