package com.example.personalTrainer.models;

import javax.persistence.*;

@Entity
@Table(name = "contents")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String title;
    private String link;
    private boolean contentIsCompleted;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Content() {
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isContentIsCompleted() {
        return contentIsCompleted;
    }

    public void setContentIsCompleted(boolean contentIsCompleted) {
        this.contentIsCompleted = contentIsCompleted;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

//    @Override
//    public String toString() {
//        return "\nContent{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", link='" + link + '\'' +
//                ", activity=" + activity +
//                '}';
//    }
}
