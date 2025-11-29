package com.icyhitman.workouttracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.icyhitman.workouttracker.dto.ExerciseRequest;
import com.icyhitman.workouttracker.entity.ExerciseDescription;
import com.icyhitman.workouttracker.service.ExerciseService;
@Controller
public class ExerciseController {
	@Autowired
	private ExerciseService exerciseService;
	@GetMapping("/all/exercise/description")
	public List<ExerciseRequest> getAllExerciseDescription(){
		List<ExerciseDescription> exerciseDescriptionEntity = exerciseService.getAllExerciseDescription();
		List<ExerciseRequest> exerciseRequest = new ArrayList();
		for(ExerciseDescription ed : exerciseDescriptionEntity) {
			ExerciseRequest er = new ExerciseRequest();
		}
		return exerciseRequest;
	}
}
