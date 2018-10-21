package demo.demoinz.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.Constraint;

@Entity
@Table(name = "App_User", uniqueConstraints = {
        @UniqueConstraint( name = "APP_USER_UK", columnNames = "USER_NAME")
        })
public class AppUser {

    @Id
    @GeneratedValue
    @Column (name = "USER_ID" , nullable = false)
    private  Long Id;

    @Column (name = "USER_NAME" , length = 36 , nullable = false)
    private String userName;

    @Column (name = "ENCRYTED_PASSWORD" , length = 128, nullable = false)
    private String encrytedPassword;

    @Column (name = "ENABLED" , length = 1, nullable = false)
    private Boolean enabled;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncrytedPassword() {
        return encrytedPassword;
    }

    public void setEncrytedPassword(String encrytedPassword) {
        this.encrytedPassword = encrytedPassword;
    }

    @Override
    public String toString() {
        return userName + ' ' + encrytedPassword;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
