package serverimpl.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * Data Transfer Object class to entity Trainee.
 */
@Entity( tableName = "Trainees",
    foreignKeys = [
        ForeignKey( entity = User::class,
            parentColumns = ["id"],
            childColumns = ["idUser"],
            onDelete = ForeignKey.CASCADE ),
        ForeignKey( entity = Trainer::class,
            parentColumns = ["idTrainer"],
            childColumns = ["idTrainer"],
            onDelete = ForeignKey.CASCADE ) ]
    )
data class Trainee(
    @PrimaryKey val idTrainee: Int,
    val idUser: Int,
    val idTrainer: Int
)