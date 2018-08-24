package com.myinterfaces;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public interface StudentFileIO {
	public int writeStudents(Student []student);
	public Student[] readStudents();
}
