package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * FROM Schedule ORDER BY stop_name ASC")
    fun getAllSchedules(): Flow<List<BusSchedule>>

    @Query("SELECT * FROM Schedule WHERE stop_name = :name")
    fun getScheduleByStopName(name: String): Flow<List<BusSchedule>>
}