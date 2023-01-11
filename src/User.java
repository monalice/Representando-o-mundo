public class User {
    private String name;
    private int age;
    private String cpf;
    private String email;
    private Address address = new Address();
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public Address getAddress() {
        return address;
    }
    private void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    void setEmail(String email) {
        this.email = email;
    }
    void setAddress(String street, String number, String cep, String state, String country) {
        this.address.setStreet(street);
        this.address.setNumber(number);
        this.address.setCep(cep);
        this.address.setState(state);
        this.address.setCountry(country);
    }

}
