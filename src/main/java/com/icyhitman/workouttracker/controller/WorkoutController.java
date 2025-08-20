package com.icyhitman.workouttracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icyhitman.workouttracker.entity.Exercise;
import com.icyhitman.workouttracker.entity.Workout;
import com.icyhitman.workouttracker.repository.WorkoutRepository;

@RestController
@RequestMapping(value = "/workouts")
public class WorkoutController {
	 @Autowired
	 private WorkoutRepository workoutRepository;
	 
	 @GetMapping
	 public List<Workout> findAll(){
		 return workoutRepository.findAll();
	 }
	 @PostMapping
	 public Workout save(@RequestBody Workout workout) {
		 System.out.println(workout);
		 
		 return workoutRepository.save(workout);
	 }
}
