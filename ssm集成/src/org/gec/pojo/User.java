package org.gec.pojo;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String telephone;

    private String username;

    private String isadmin;

    public User(Integer id, String name, String password, String telephone, String username, String isadmin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.telephone = telephone;
        this.username = username;
        this.isadmin = isadmin;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin == null ? null : isadmin.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", telephone=").append(telephone);
        sb.append(", username=").append(username);
        sb.append(", isadmin=").append(isadmin);
        sb.append("]");
        return sb.toString();
    }
}