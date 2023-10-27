package student;

class Student {

    private String student_id = "143100";

    private String first_name = "Juan";

    private String last_name = "dela Cruz";

    private String middle_name = "Sanchez";

    private String suffix = "Jr.";

    private String age = "20";

    private String year_level = "2";

    private String phone_no = "09756435213";

    private String email = "juandelacruz@gmail.com";

    private String course_name = "1. Bachelor of Science in Information Technology (BSIT)";

    private String course_code = "BSIT";

    private String department = "College of Computer Studies Department";

    void setStudentId(String student_id) {

        this.student_id = student_id;

    }

    String getStudentId() {

        return this.student_id;

    }

    void setFirstName(String a) {

        if (a.equals("")) {
        } else {
            this.first_name = a;
        }

    }

    String getFirstName() {

        return this.first_name;

    }

    void setMiddleName(String b) {

        if (b.equals("")) {
        } else {
            this.middle_name = b;
        }
    }

    String getMiddleName() {

        return this.middle_name;

    }

    void setLastName(String c) {

        if (c.equals("")) {
        } else {
            this.last_name = c;
        }

    }

    String getLastName() {

        return this.last_name;

    }

    void setSuffix(String d) {

        if (d.equals("")) {
        } else {
            this.suffix = d;
        }

    }

    String getSuffix() {

        return this.suffix;

    }

    void setAge(String e) {

        if (e.equals("")) {
        } else {
            this.age = e;
        }

    }

    String getAge() {

        return this.age;

    }

    void setYearLevel(String f) {

        if (f.equals("")) {
        } else {
            this.year_level = f;
        }

    }

    String getYearLevel() {

        return this.year_level;

    }

    void setPhoneNo(String g) {

        if (g.equals("")) {
        } else {
            this.phone_no = g;
        }

    }

    String getPhoneNo() {

        return this.phone_no;

    }

    void setEmail(String h) {

        if (h.equals("")) {
        } else {
            this.email = h;
        }

    }

    String getEmail() {

        return this.email;

    }

    void setCourseName(String i) {

        if (i.equals("")) {
        } else {
            this.course_name = i;
        }

    }

    String getCourseName() {

        return this.course_name;

    }

    void setCourseCode(String j) {

        if (j.equals("")) {
        } else {
            this.course_code = j;
        }

    }

    String getCourseCode() {

        return this.course_code;

    }

    void setDepartment(String k) {

        if (k.equals("")) {
        } else {
            this.department = k;
        }

    }

    String getDepartment() {

        return this.department;

    }

}
