package com.icyhitman.workouttracker.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Workout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;	
	@OneToMany(mappedBy = "workout" ,cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Exercise> exercises = new ArrayList<>();
	
	
	
	
	public void addExercise(Exercise exercise) {
		this.exercises.add(exercise);
		exercise.setWorkout(this);
	}
	public void removeExercise(Exercise exercise) {
		this.exercises.remove(exercise);
		exercise.setWorkout(null);
	}
	public Workout(String name) {
		this.name = name;
	}
}
