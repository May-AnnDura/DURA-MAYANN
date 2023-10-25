package student;

class Student {

    private String first_name = "";

    private String last_name = "";

    private String middle_name = "";

    private String suffix = "";

    void setFirstName(String first_name) {

        this.first_name = first_name;

    }

    String getFirstName() {

        return this.first_name;

    }

    void setLastName(String last_name) {

        this.last_name = last_name;

    }

    String getLastName() {

        return this.last_name;

    }

    void setMiddleName(String middle_name) {

        this.middle_name = middle_name;

    }

    String getMiddleName() {

        return this.middle_name;

    }

    void setSuffix(String suffix) {

        this.suffix = suffix;

    }

    String getSuffix() {

        return this.suffix;

    }

    public String FullName() {

        return " " + getFirstName() + " " + getMiddleName() + " " +
                getLastName() + " or " + getFirstName() + " ";

    }

}
