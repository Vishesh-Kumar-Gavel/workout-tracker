package com.icyhitman.workouttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icyhitman.workouttracker.entity.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer>{
	
}
