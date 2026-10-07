class Employee{String name,type;Employee(String n,String t){name=n;type=t;}}
interface LeavePolicy{boolean allowed(int days);}
class FullTimePolicy implements LeavePolicy{public boolean allowed(int d){return d<=30;}}
class PartTimePolicy implements LeavePolicy{public boolean allowed(int d){return d<=15;}}
class ContractorPolicy implements LeavePolicy{public boolean allowed(int d){return d<=10;}}
class LeaveRequest{Employee e;int days;String status="Pending";LeaveRequest(Employee e,int d){this.e=e;this.days=d;}void review(LeavePolicy p,boolean approve){if(!status.equals("Pending"))throw new IllegalStateException();status=approve&&p.allowed(days)?"Approved":"Rejected";}}
public class Main{public static void main(String[]a){LeaveRequest r=new LeaveRequest(new Employee("Asha","FullTime"),5);r.review(new FullTimePolicy(),true);System.out.println(r.status);}}