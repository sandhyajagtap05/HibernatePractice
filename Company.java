package XMLBasedConfiguration;

public class Company {

    private  int CompanyId;
    private  String CompanyName;

    private  String Address;

    private int NoEmployee;

    public Company() {
    }

    public Company(int companyId, String companyName, String address, int noEmployee) {
        CompanyId = companyId;
        CompanyName = companyName;
        Address = address;
        NoEmployee = noEmployee;
    }

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int companyId) {
        CompanyId = companyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNoEmployee() {
        return NoEmployee;
    }

    public void setNoEmployee(int noEmployee) {
        NoEmployee = noEmployee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "CompanyId=" + CompanyId +
                ", CompanyName='" + CompanyName + '\'' +
                ", Address='" + Address + '\'' +
                ", NoEmployee=" + NoEmployee +
                '}';
    }
}
