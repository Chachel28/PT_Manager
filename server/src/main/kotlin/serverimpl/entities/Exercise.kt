package serverimpl.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data Transfer Object class to entity Exercises.
 */
@Entity(tableName = "Exercises")
data class Exercise(
    @PrimaryKey val idExercise: Int,
    val exerciseName: String,
    val locationFile: String
)