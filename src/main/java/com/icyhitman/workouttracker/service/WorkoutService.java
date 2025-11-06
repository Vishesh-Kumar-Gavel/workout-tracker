package com.icyhitman.workouttracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icyhitman.workouttracker.entity.Exercise;
import com.icyhitman.workouttracker.entity.Workout;
import com.icyhitman.workouttracker.repository.WorkoutRepository;

import dto.ExerciseDTO;
import dto.WorkoutRequest;

@Service()
public class WorkoutService {
	@Autowired
	private WorkoutRepository workoutRepository ;
	
	public  Workout createWorkout(WorkoutRequest request) {
		Workout workout = new Workout(request.getName());
		if(request.getExercises()!= null) {
			for(ExerciseDTO exercise : request.getExercises()) {
				Exercise ex = new Exercise();
				ex.setName(exercise.getName());
				workout.addExercise(ex);
			}
		}
		
		return workoutRepository.save(workout);
	
	}
	public List<WorkoutRequest> findAll(){
		List<Workout> workouts = workoutRepository.findAll();
		List<WorkoutRequest> workoutRequests = new ArrayList<>();
		for(Workout w : workouts) {
			WorkoutRequest workoutRequest = new WorkoutRequest();
			List<ExerciseDTO> workoutRequestExercises = new ArrayList<>();
			workoutRequest.setName(w.getName());
			for(Exercise e : w.getExercises()) {
				ExerciseDTO e1 = new ExerciseDTO(e.getName());
				workoutRequestExercises.add(e1);
			}
			workoutRequest.setExercises(workoutRequestExercises);
			workoutRequests.add(workoutRequest);
		}
		return workoutRequests;
	}
}
