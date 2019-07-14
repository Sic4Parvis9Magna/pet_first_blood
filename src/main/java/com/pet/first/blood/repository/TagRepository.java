package com.pet.first.blood.repository;

import com.pet.first.blood.domain.Tag;

import java.util.List;
import java.util.Optional;

public interface TagRepository {
    Tag save(Tag tag);
    Tag update(Tag tag, String tagId);
    Tag delete(String tagId);
    Optional<Tag> findById(String tagId);
    List<Tag> findAll();
}
