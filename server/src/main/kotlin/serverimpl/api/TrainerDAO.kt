package serverimpl.api

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import serverimpl.entities.Trainer
import serverimpl.relations.TrainerWithTrainees

/**
 * API interface to manage Trainer entities.
 */
@Dao interface TrainerDAO {
    @Insert
    fun insert(trainer: Trainer)

    //Think about if we need a update function here

    @Delete
    fun delete(trainer: Trainer)

    @Query("SELECT * FROM Trainers WHERE idTrainer = :id")
    fun getById(id: Int): Trainer?

    @Transaction
    @Query("SELECT * FROM Trainers WHERE idTrainer = :id")
    fun getTrainerWithTrainees(id: Int): TrainerWithTrainees
}