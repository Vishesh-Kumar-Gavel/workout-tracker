package com.icyhitman.workouttracker.entity;
import jakarta.persistence.*; // Use javax.persistence.* if using Spring Boot 2.x
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data // Generates Getters, Setters, toString, equals, and hashcode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exercise_description", schema = "public")
public class ExerciseDescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Database handles ID
	@Column(name = "ed_id", nullable = false)
	private Integer id;

    @Column(name = "ed_name")
    private String name;

    @Column(name = "ed_equipment")
    private String equipment;

    @Column(name = "ed_variation")
    private String variation;

    @Column(name = "ed_utility")
    private String utility;

    @Column(name = "ed_mechanics")
    private String mechanics;

    @Column(name = "ed_force")
    private String force;

    // Length is 1000 in DB, standard string maps fine, 
    // but @Column(length=1000) helps if you let Hibernate validate schema.
    @Column(name = "ed_preparation", length = 1000)
    private String preparation;

    @Column(name = "ed_execution", length = 1000)
    private String execution;

    @Column(name = "ed_target_muscle", length = 1000)
    private String targetMuscle;

    @Column(name = "ed_synergist_muscle", length = 1000)
    private String synergistMuscle;

    @Column(name = "ed_stabilizer_muscle", length = 1000)
    private String stabilizerMuscle;

    @Column(name = "ed_antagonist_muscle", length = 1000)
    private String antagonistMuscle;

    @Column(name = "ed_dynamic_stabilizer_muscle", length = 1000)
    private String dynamicStabilizerMuscle;

    @Column(name = "ed_main_muscle")
    private String mainMuscle;

    @Column(name = "ed_difficulty")
    private Integer difficulty;

    @Column(name = "ed_secondary_muscle")
    private String secondaryMuscle;

    @Column(name = "ed_parent_id")
    private Integer parentId; 
    // Note: If you want to actually link this to another ExerciseDescription object,
    // you would replace Integer parentId with:
    // @ManyToOne 
    // @JoinColumn(name = "ed_parent_id")
    // private ExerciseDescription parent;
}