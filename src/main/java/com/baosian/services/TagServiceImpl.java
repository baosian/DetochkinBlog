package com.baosian.services;

import com.baosian.entity.Tag;
import com.baosian.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService{

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag addTag(Tag tag) {
        return tagRepository.saveAndFlush(tag);
    }

    @Override
    public void delete(Integer id) {
        tagRepository.deleteById(id);
    }

    @Override
    public List<Tag> getAll() {
        return tagRepository.findAll();
    }
}
