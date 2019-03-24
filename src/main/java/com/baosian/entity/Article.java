package com.baosian.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Article")
public class Article {

    @Id
    @GeneratedValue(generator = "incerment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private Text text;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ArticleStatus status;

    @Column(name = "author_id")
    @JoinColumn(table = "user", name = "id")
    private Integer author_id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;
}
