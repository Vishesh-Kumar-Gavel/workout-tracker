package com.icyhitman.workouttracker.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Workout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id")
//	private User user;
//	
	@OneToMany(mappedBy = "workout" ,cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Exercise> exercises = new HashSet<>();
	
	private void addExercise(Exercise exercise) {
		this.exercises.add(exercise);
		exercise.setWorkout(this);
	}
	private void removeExercise(Exercise exercise) {
		this.exercises.remove(exercise);
		exercise.setWorkout(null);
	}
}
