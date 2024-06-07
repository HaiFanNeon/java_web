package pojo;

public class User {
    private String name;
    private String gender;
    private String tellphone;
    private boolean collection;


    public User() {
    }

    public User(String name, String gender, String tellphone, boolean collection) {
        this.name = name;
        this.gender = gender;
        this.tellphone = tellphone;
        this.collection = collection;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return tellphone
     */
    public String getTellphone() {
        return tellphone;
    }

    /**
     * 设置
     * @param tellphone
     */
    public void setTellphone(String tellphone) {
        this.tellphone = tellphone;
    }

    /**
     * 获取
     * @return collection
     */
    public boolean isCollection() {
        return collection;
    }

    /**
     * 设置
     * @param collection
     */
    public void setCollection(boolean collection) {
        this.collection = collection;
    }

    public String toString() {
        return "User{name = " + name + ", gender = " + gender + ", tellphone = " + tellphone + ", collection = " + collection + "}";
    }
}
