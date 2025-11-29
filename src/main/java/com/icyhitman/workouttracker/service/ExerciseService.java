package com.icyhitman.workouttracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icyhitman.workouttracker.entity.ExerciseDescription;
import com.icyhitman.workouttracker.repository.ExerciseRepo;

@Service
public class ExerciseService {
	@Autowired
	private ExerciseRepo exerciseRepo;
	
	public List<ExerciseDescription>getAllExerciseDescription() {
		return exerciseRepo.getAllExerciseDescription();
	}
}
