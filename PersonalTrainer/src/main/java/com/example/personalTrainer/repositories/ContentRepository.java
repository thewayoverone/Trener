package com.example.personalTrainer.repositories;

import com.example.personalTrainer.models.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
    public Content findByTitle(String contentName);
}
