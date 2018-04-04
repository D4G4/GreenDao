package com.example.dakshgargas.dakshgreendaodemo;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by dakshgargas
 */


//What is the purpose of this converter?

public class NoteTypeConverter implements PropertyConverter<NoteType, String> {
    @Override
    public NoteType convertToEntityProperty(String databaseValue) {
        return NoteType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(NoteType entityProperty) {
        return entityProperty.name();
    }
}
