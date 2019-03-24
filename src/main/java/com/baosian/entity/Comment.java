package com.baosian.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Comment")
public class Comment {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "message")
    private Text message;

    @Column(name = "post_id")
    @JoinColumn(table = "article",name = "id", nullable = false)
    private Integer post_id;

    @Column(name = "author_id")
    @JoinColumn(table = "user", name = "id", nullable = false)
    private Integer author_id;

    @Column(name = "created_at")
    private Date created_at;

}
