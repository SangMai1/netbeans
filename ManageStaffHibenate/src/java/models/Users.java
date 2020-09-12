package models;
// Generated Mar 13, 2020 7:34:46 AM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="users"
    ,schema="dbo"
    ,catalog="dbDemo"
)
public class Users  implements Serializable {
     private String username;
     private String password;
     private String fullname;
     private Integer age;
     private Date birthday;
     private Boolean gender;

    public Users() {
    }

	
    public Users(String username) {
        this.username = username;
    }
    public Users(String username, String password, String fullname, Integer age, Date birthday, Boolean gender) {
       this.username = username;
       this.password = password;
       this.fullname = fullname;
       this.age = age;
       this.birthday = birthday;
       this.gender = gender;
    }
   
     @Id 

    
    @Column(name="Username", unique=true, nullable=false)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="Password")
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="Fullname")
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    
    @Column(name="Age")
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Birthday", length=10)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    @Column(name="Gender")
    public Boolean getGender() {
        return this.gender;
    }
    
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Users{" + "username=" + username + ", password=" + password + ", fullname=" + fullname + ", age=" + age + ", birthday=" + birthday + ", gender=" + gender + '}';
    }
    



}


