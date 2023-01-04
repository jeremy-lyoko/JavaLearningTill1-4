public class User {
    private String name;
    private String password;
    private String email;
    private int number;

    public User() {
    }

    public User(String name, String password, String email, int number) {
        this.name=name;
        this.password=password;
        this.email=email;
        this.number=number;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", email = " + email + ", number = " + number + "}";
    }
}
