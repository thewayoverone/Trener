package com.example.personalTrainer.repositories;

import com.example.personalTrainer.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
