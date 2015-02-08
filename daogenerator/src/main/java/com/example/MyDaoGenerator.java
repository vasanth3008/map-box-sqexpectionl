package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class MyDaoGenerator {
    public static void main(String args[]) throws Exception {

        Schema schema = new Schema(3, "com.example.vasanth.model");
        Entity box = schema.addEntity("Box");
        box.addIdProperty();
        new DaoGenerator().generateAll(schema, args[0]);
    }
}
