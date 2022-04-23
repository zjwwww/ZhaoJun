package com.zhaojun.nov.springbootzhaojun.doman;

import javax.persistence.*;

/**
 * @author DELL
 * @date 2022/4/21 19:54
 * 用户类
 */
@Entity
@Table(name="user_info_tb")
public class User {
    /**
     * 用户id
     */
    @Id //该字段对应数据库的主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置自增长
    @Column(name="id")
    private Long id;

    /**
     * 用户名
     */
    @Column(name="name")
    private String username;

    /**
     * 用户密码
     */
    @Column(name="pasword")
    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 年龄
     */
    private int age;

    /**
     * 状态：1
     */
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


}
