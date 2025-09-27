package serverimpl.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Data Transfer Object class to entity Users.
 */
@Entity(tableName = "Users")
data class User(
        @PrimaryKey val id: Int,
        val name: String,
        val mail: String,
        val pass: String
)

