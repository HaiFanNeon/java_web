package pojo;

public class Admin {
    private String username = "root";
    private String password = "root";


    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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

    public String toString() {
        return "Admin{username = " + username + ", password = " + password + "}";
    }
}
