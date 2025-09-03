package dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkoutRequest {
	@NotNull
	String name;
	List<ExerciseDTO> exercises;
	@Override
	public String toString() {
		return "WorkoutRequest [name=" + name + ", exercises=" + exercises + "]";
	}
	
	
}
