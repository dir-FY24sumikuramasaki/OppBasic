package Dougakusya;

public class School {
    
    String name;
    int grade;
    int score;
    
    public School(String name,int grade,int score) {
        this.name=name;
        this.grade=grade;
        this.score=score;
    }
    
    public void spec() {
        System.out.println("大学："+name+"学年："+grade+"年生です。偏差値："+score);
       
    }
    
    public String getName() {
        return name;
    }
}
