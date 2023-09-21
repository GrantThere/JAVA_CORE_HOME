package HW_2;



public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private Addres address;
    private Company company;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    public void setAddress(String street, String suite, String city, String zipcode) {
        Addres addres = new Addres();
        addres.setStreet(street);
        addres.setSuite(suite);
        addres.setCity(city);
        addres.setZipcode(zipcode);
        this.address = addres;
    }

    public void setCompany(String name, String catchPhrase, String bs) {
        Company company = new Company();
        company.setName(name);
        company.setCatchPhrase(catchPhrase);
        company.setBs(bs);
        this.company = company;
    }

    public String toString() {
        return name + username + email + phone + website + address.toString() + company.toString();
    }


}
