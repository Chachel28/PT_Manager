package serverimpl.api

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import serverimpl.entities.Exercise

/**
 * API interface to manage Trainee Exercise.
 */
@Dao
interface ExerciseDAO {
    @Insert
    fun insert(exercise: Exercise)

    @Update
    fun update(exercise: Exercise)

    @Delete
    fun delete(exercise: Exercise)

    @Query("SELECT * FROM Exercises WHERE idExercise = :id")
    fun getById(id: Int): Exercise?

    @Query("SELECT * FROM Exercises")
    fun getAll(): List<Exercise>
}