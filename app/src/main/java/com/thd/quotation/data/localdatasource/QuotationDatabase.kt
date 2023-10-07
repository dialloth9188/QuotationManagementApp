package com.thd.quotation.data.localdatasource

import android.content.Context
/*

@Database(entities = [Quotation::class], version = 1)
abstract class QuotationDatabase : RoomDatabase() {
    abstract fun doa(): QuotationDAO

    companion object {
        var INSTANCE: QuotationDatabase? = null
        fun getDatabaseInstance(context: Context): QuotationDatabase {

            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        QuotationDatabase::class.java,
                        "contact_db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}*/
