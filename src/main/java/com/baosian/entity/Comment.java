package com.baosian.entity;

import lombok.Data;
import org.w3c.dom.Text;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Comment {
    private Integer id;
    private Text message;
    private Integer post_id;
    private Integer author_id;
    private Date created_at;

}
