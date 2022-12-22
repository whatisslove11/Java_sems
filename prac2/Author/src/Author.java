public class Author {
    private String name, email;
    private String gender;
    public Author(String email, String name, String gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String getName (){return name;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author has next information:\n" +
                "name='" + name + '\n' +
                "email='" + email + '\n' +
                "gender='" + gender + '\n'
                ;
    }
}