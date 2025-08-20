package com.icyhitman.workouttracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class ExerciseSet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "exercise_id",nullable=false)
//	private Exercise exercise;
//	
	private int weight;
	private int reps;
}
