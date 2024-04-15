package Dougakusya;

public class Member{

    String name;
    School school;
    int age;
    
    public Member(String name,School school,int age) {
        
        this.name=name;
        this.school=school;
        this.age=age;
        
    }
    
    public void report(int times) {
        System.out.println(times+"回目の報告をします。大学名："+school.getName()+" "+"名前："+name+" "+age+"歳。");
    }
    public void report() {
        report(1);
    }
    public void reportSpec() {
        school.spec();
        System.out.println("➡上記の成績で間違いありません。名前："+name+" 大学名："+school.getName());
    }
    }