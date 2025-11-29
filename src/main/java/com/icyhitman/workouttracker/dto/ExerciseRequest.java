package com.icyhitman.workouttracker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExerciseRequest {
	String name;
	int sets;
	String reps;
	@Override
	public String toString() {
		return "ExerciseDTO [name=" + name + "]";
	}
}
	
