package com.zhaojun.nov.springbootzhaojun.doman;

import javax.persistence.*;

/**
 * @author DELL
 * @date 2022/4/24 10:52
 */
@Entity
@Table(name="classify_type")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="classfy_id")
    private Long id;

    @Column(name="classfy_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
