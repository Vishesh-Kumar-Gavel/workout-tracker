package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExerciseDTO {
	String name;

	@Override
	public String toString() {
		return "ExerciseDTO [name=" + name + "]";
	}
	
}
