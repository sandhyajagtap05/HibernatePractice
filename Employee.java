package XMLBasedConfiguration;

public class Employee {

    private  int EmpNo;

    private  String EmpName;

    private  String Address;

    public Employee() {
    }

    public Employee(int empNo, String empName, String address) {
        EmpNo = empNo;
        EmpName = empName;
        Address = address;
    }

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int empNo) {
        EmpNo = empNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpNo=" + EmpNo +
                ", EmpName='" + EmpName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
