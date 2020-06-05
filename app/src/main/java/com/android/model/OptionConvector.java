package com.android.model;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class OptionConvector {
    @TypeConverter
    public static List<OptionModel2> stringToSomeObjectList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }
        Type listType = new TypeToken<List<OptionModel2>>() {}.getType();

        return new Gson().fromJson(data, listType);
    }
    @TypeConverter
    public static String someObjectListToString(List<OptionModel2> someObjects) {
        return new Gson().toJson(someObjects);
    }
}
