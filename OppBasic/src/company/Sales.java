package company;

public class Sales extends Employee {
    
    public Sales(String name, Department department, String position, int employeeid) {
        super(name, department, position, employeeid);
    }
    
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("営業として、上記の会議に参加します。部署："+department.getName()+"名前："+ name);
    }

}
