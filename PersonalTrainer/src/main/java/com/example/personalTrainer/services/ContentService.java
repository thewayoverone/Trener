package com.example.personalTrainer.services;

import com.example.personalTrainer.models.Content;
import com.example.personalTrainer.repositories.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    ContentRepository contentRepository;

    public List<Content> findAll() {
        return contentRepository.findAll();
    }

    public Content findById(Long id) {
        return contentRepository.getReferenceById(id);
    }

    public Content findByTitle(String name) {
        return contentRepository.findByTitle(name);
    }
}
