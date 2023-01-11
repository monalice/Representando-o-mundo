public class Address {
    private String street;
    private String number;
    private String cep;
    private String state;
    private String country;

    String getStreet() {
        return this.street;
    }

    void setStreet(String street) {
        this.street = street;
    }

    String getNumber() {
        return this.number;
    }

    void setNumber(String number) {
        this.number = number;
    }

    String getCep() {
        return this.cep;
    }
    
    void setCep(String cep) {
        this.cep = cep;
    }

    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
    }

    String getCountry() {
        return country;
    }
    
    void setCountry(String country) {
        this.country = country;
    }
}
