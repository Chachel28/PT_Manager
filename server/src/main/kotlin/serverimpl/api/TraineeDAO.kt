package serverimpl.api

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import serverimpl.entities.Trainee
import serverimpl.entities.Trainer
import serverimpl.relations.TraineeWithTrainer

/**
 * API interface to manage Trainee entities.
 */
@Dao interface TraineeDAO {
    @Insert
    fun insert(trainee: Trainee)

    //Think about if we need a update function here

    @Delete
    fun delete(trainee: Trainee)

    @Query("SELECT * FROM Trainees WHERE idTrainee = :id")
    fun getById(id: Int): Trainee?

    @Transaction
    @Query("SELECT * FROM Trainees WHERE idTrainee = :id")
    fun getTraineeWithTrainer(id: Int): TraineeWithTrainer
}