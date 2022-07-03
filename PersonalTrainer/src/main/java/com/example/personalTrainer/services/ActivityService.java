package com.example.personalTrainer.services;

import com.example.personalTrainer.models.Activity;
import com.example.personalTrainer.models.User;
import com.example.personalTrainer.repositories.ActivityRepository;
import com.example.personalTrainer.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;
    @Autowired
    private UserRepository userRepository;

    public Activity findById(Long id) {
        return activityRepository.getReferenceById(id);
    }

    public List<Activity> findAll() {
        return activityRepository.findAll();
    }

    public Activity createActivity(Activity activity, Long userID) {
        User user = userRepository.findById(userID).get();
        activity.setUser(user);
        return activityRepository.save(activity);
    }

    public Activity completeActivity(Long activityID) {
        Activity activity = activityRepository.findById(activityID).get();
        activity.setActivityIsCompleted(!activity.isActivityIsCompleted());
        return activityRepository.save(activity);
    }
}
