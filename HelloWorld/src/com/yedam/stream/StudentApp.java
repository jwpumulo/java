package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	Scanner scn = new Scanner(System.in);

	List<Student> students = new ArrayList<>();

	public StudentApp() {

		init();

	}

	public void start() throws Exception {
		boolean run = true;

		while (run) {

			System.out.println("===================================");
			System.out.println("1.목록 2.추가 3.삭제 9.종료");
			System.out.println("===================================");
			System.out.print("골라>>");

			int menu = 0;

			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (Exception e) {
				System.out.println("다시");
				continue;
			}

			switch (menu) {
			case 1:
				studentList();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				removeStudent();
				break;
			case 9:
				run = false;
				System.out.println("끝남");
				save();
				break;
			default:
				System.out.println("뭐함?");
			}
		}
	}

	void studentList() {

		System.out.println(" 이름 점수");
		System.out.println("===========");
		for (Student item : students) {
			System.out.printf("%3s %3d\n", item.getName(), item.getScore());
		}
	}

	void addStudent() throws Exception {

		System.out.print("이름>>");
		String name = scn.nextLine();

		double height = 0.0;

		while (true) {
			try {
				System.out.print("키>>");
				height = Double.parseDouble(scn.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("키 다시");
			}
		}
		double weight = 0.0;

		while (true) {
			try {
				System.out.print("몸무게>>");
				weight = Double.parseDouble(scn.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("몸무게 다시");
			}
		}
		int score = 0;

		while (true) {
			try {
				System.out.print("점수>>");
				score = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("점수 다시");
			}
		}

		students.add(new Student(name, height, weight, score));
		System.out.println("등록함");
	}

	void removeStudent() {

		System.out.print("이름>>");
		String name = scn.nextLine();

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제함");
				return;
			}
		}
		System.out.println("삭제못함");
	}

	void save() {
		try {
			Writer writer = new FileWriter("c:/temp/studentList.txt");
//			BufferedWriter bwriter = new BufferedWriter(writer);

			for (Student item : students) {
				writer.write(item.getName() + " " + item.getHeight() + " " + item.getWeight() + " " + item.getScore()
						+ "\n");
			}

			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("저장됨");
	}

	void init() {
		try {
			Reader reader = new FileReader("c:/temp/studentList.txt");
			BufferedReader breader = new BufferedReader(reader);

			while (true) {

				String data = breader.readLine();

				if (data == null) {
					break;
				}

				String[] result = data.split(" ");

				students.add(new Student(result[0], Double.parseDouble(result[1]), Double.parseDouble(result[2]),
						Integer.parseInt(result[3])));
			}

			breader.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
