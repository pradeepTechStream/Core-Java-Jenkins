package test.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class Student {
    private final String name;
     final int id;

    public String getName() {
	return name;
    }

    public int getId() {
	return id;
    }

    Student(String name, int id) {
	this.name = name;
	this.id = id;

    }

}
