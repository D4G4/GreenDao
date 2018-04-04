package com.example.dakshgargas.dakshgreendaodemo;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by dakshgargas
 */

public class App extends Application {
    public static final boolean ENCRYPTED = true;

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,
                ENCRYPTED ? "notes-db-encrypted" : "notes-db");

        Database db = ENCRYPTED ? helper.getEncryptedReadableDb("super-secret")
                : helper.getReadableDb();

        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
