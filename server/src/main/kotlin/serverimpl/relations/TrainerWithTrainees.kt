package serverimpl.relations

import androidx.room.Embedded
import androidx.room.Relation
import serverimpl.entities.Trainee
import serverimpl.entities.Trainer

/**
 * Relation traine-trainer (oneToOne)
 */
data class TraineeWithTrainer(
    @Embedded val trainee: Trainee,
    @Relation(
        parentColumn = "idTrainer",
        entityColumn = "idTrainer"
    )
    val trainer: Trainer
)