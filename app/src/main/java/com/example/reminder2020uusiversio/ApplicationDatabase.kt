package com.example.reminder2020uusiversio

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Reminder::class], version = 1 )
abstract class AppDatabase : RoomDatabase() {
    abstract fun reminderDao() : ReminderDao
}