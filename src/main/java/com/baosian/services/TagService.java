package com.baosian.services;

import com.baosian.entity.Tag;

import java.util.List;

public interface TagService {

    Tag addTag(Tag tag);
    void delete(Integer id);
    List<Tag> getAll();
}
