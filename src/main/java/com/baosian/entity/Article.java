package com.baosian.entity;

import lombok.Data;
import org.w3c.dom.Text;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Article {
    private Integer id;
    private String title;
    private Text text;
    private Enum status;
    private Integer author_id;
    private Date created_at;
    private Date updated_at;
}
