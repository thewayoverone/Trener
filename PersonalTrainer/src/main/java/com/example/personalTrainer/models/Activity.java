package com.example.personalTrainer.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String title;
    private boolean activityIsCompleted;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "activity", fetch = FetchType.EAGER)
    private List<Content> contentList = new ArrayList<>();

    public Activity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActivityIsCompleted() {
        return activityIsCompleted;
    }

    public void setActivityIsCompleted(boolean activityIsCompleted) {
        this.activityIsCompleted = activityIsCompleted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    @Override
    public String toString() {
        return "\nActivity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", activityIsCompleted=" + activityIsCompleted +
                ", user=" + user +
                ", contentList=" + contentList +
                '}';
    }
}
