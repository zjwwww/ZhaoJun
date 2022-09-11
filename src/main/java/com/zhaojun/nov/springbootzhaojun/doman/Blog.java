package com.zhaojun.nov.springbootzhaojun.doman;

import javax.persistence.*;

/**
 * @author DELL
 * @date 2022/5/8 10:12
 */
@Entity
@Table(name="blog")
public class Blog {

    /**
     * 博客Id
     */
    @Id
    @Column(name="blog_id")
    private Long blogId;

    /**
     * 博客标题
     */
    @Column(name="blog_title")
    private String blogTitle;

    /**
     * 博客内容
     */
    @Column(name="blog_content")
    private String blogContent;

    /**
     * 更新时间
     */
    @Column(name="blog_update_time")
    private String updateTime;

    /**
     * 创建时间
     */
    @Column(name="blog_create_time")
    private String createTime;

    /**
     * 与user时多对一的关系
     */
    @ManyToOne(cascade = CascadeType.REFRESH,optional = false)
    @JoinColumn(name="blog_user_id")
    private User user;

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
