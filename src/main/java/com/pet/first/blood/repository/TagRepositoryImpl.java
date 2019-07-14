package com.pet.first.blood.repository;

import com.pet.first.blood.domain.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TagRepositoryImpl implements TagRepository {
    @Override
    public Tag save(Tag tag) {
        return null;
    }

    @Override
    public Tag update(Tag tag, String tagId) {
        return null;
    }

    @Override
    public Tag delete(String tagId) {
        return null;
    }

    @Override
    public Optional<Tag> findById(String tagId) {
        return Optional.empty();
    }

    @Override
    public List<Tag> findAll() {
        return null;
    }
}
