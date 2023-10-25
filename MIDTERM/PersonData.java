class PersonData {

    private String firstName, lastName, middleName;
    private int age;
    private String birthDay;
    private String address;

    PersonData(String firstName, String lastName, String middleName, int age, String birthDay,
            String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.birthDay = birthDay;
        this.address = address;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName(String firstName) {
        return firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName(String lastName) {
        return lastName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    String getMiddleName(String middleName) {
        return middleName;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getAge(String age) {
        return age;
    }

    void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    String getBirthDay(String birthDay) {
        return birthDay;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress(String address) {
        return address;
    }
}
