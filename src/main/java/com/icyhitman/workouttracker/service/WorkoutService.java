package com.icyhitman.workouttracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icyhitman.workouttracker.entity.Exercise;
import com.icyhitman.workouttracker.entity.Workout;
import com.icyhitman.workouttracker.repository.WorkoutRepository;
import com.icyhitman.workouttracker.dto.ExerciseRequest;
import com.icyhitman.workouttracker.dto.WorkoutRequest;

import com.icyhitman.workouttracker.service.WorkoutService;

@Service()
public class WorkoutService {
	@Autowired
	private WorkoutRepository workoutRepository ;
	
	public  Workout createWorkout(WorkoutRequest workoutRequest) {
		Workout workout = new Workout(workoutRequest.getName());
		if(workoutRequest.getExercises()!= null) {
			for(ExerciseRequest exercise : workoutRequest.getExercises()) {
				Exercise ex =  Exercise.builder()
						.name(exercise.getName())
						.sets(exercise.getSets()).reps(exercise.getReps())
						.build();
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
			List<ExerciseRequest> workoutRequestExercises = new ArrayList<>();
			workoutRequest.setName(w.getName());
			for(Exercise e : w.getExercises()) {
				ExerciseRequest e1 = new ExerciseRequest(e.getName(),e.getSets(),e.getReps());
				workoutRequestExercises.add(e1);
			}
			workoutRequest.setExercises(workoutRequestExercises);
			workoutRequests.add(workoutRequest);
		}
		return workoutRequests;
	}
	
	public Boolean deleteWorkout(String workoutName) {
		List<Workout> workouts = workoutRepository.findByName(workoutName);
		if(workouts!=null && workouts.size()>0) {
			workoutRepository.deleteById(workouts.get(0).getId());
			return true;
		}
		return false;
	}
}













