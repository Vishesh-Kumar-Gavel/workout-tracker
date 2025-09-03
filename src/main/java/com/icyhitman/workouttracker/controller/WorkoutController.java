package com.icyhitman.workouttracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icyhitman.workouttracker.service.WorkoutService;

import dto.WorkoutRequest;

@RestController
@RequestMapping(value = "/workouts")
public class WorkoutController {
	 @Autowired
	 private WorkoutService workoutService;
	 
	 @GetMapping
	 public List<WorkoutRequest> findAll(){
		 return workoutService.findAll();
	 }
	 
	 @PostMapping
	 public WorkoutRequest createWorkout(@RequestBody WorkoutRequest workout) {		 
		 workoutService.createWorkout(workout);
		 return workout;
	 }
}
