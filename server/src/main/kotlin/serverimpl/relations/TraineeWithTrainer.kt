package serverimpl.relations

import androidx.room.Embedded
import androidx.room.Relation
import serverimpl.entities.Trainee
import serverimpl.entities.Trainer


/**
 * Relation trainer-trainees (oneToMany)
 */
data class TrainerWithTrainees(
    @Embedded val trainer: Trainer,
    @Relation(
        parentColumn = "idTrainer",
        entityColumn = "idTrainer"
    )
    val trainees: List<Trainee>
)