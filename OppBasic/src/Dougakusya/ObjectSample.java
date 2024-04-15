package Dougakusya;

public class ObjectSample {

    public static void main(String[] args) {
 
        var school = new School("一橋大学",4,22);
        var member = new Member("正樹",school, 22);
        
        member.report();
        member.reportSpec();
        
        System.out.println("");
        
        School ryotaSchool = new School("東京農業大学",2,20);
        Member ryota = new Member("森", ryotaSchool, 20);
        
        ryota.report();
        ryota.reportSpec();
    }

}
