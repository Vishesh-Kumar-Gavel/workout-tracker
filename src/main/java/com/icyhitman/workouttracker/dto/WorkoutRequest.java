package com.icyhitman.workouttracker.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkoutRequest {
	
	String name;
	List<ExerciseRequest> exercises;
	@Override
	public String toString() {
		return "WorkoutRequest [name=" + name + ", exercises=" + exercises + "]";
	}
	
	
}
