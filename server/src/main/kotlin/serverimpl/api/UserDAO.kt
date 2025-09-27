package serverimpl.api

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import serverimpl.entities.User

/**
 * API interface to manage user entities.
 */
@Dao
interface UserDAO {
    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM Users WHERE id = :id")
    fun getById(id: Int): User?
}