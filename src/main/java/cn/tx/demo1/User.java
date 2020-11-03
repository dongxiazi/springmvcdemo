package cn.tx.demo1;

import java.io.Serializable;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4637930798271811952L;
    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
