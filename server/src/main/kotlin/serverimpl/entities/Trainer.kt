package serverimpl.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

/**
 * Data Transfer Object class to entity Trainers.
 */
@Entity(tableName = "Trainers",
    foreignKeys = [
        ForeignKey( entity = User::class,
            parentColumns = ["id"],
            childColumns = ["idUser"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Trainer(
    @PrimaryKey val idTrainer: Int,
    val idUser: Int
)
