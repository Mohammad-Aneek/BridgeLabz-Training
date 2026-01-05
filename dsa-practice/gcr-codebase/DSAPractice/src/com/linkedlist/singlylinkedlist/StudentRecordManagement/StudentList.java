package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentList {
	// to store head, tail, and size of list
	private StudentNode head;
	private StudentNode tail;
	private int size;

	public StudentList() {
		head = tail = null;
		size = 0;
	}

	// to add student at beginning of list
	public void addStudentAtBeginning(String rollNumber, String name, int age) {
		if (head == null) {
			// if list is empty	
			head = tail = new StudentNode(rollNumber, name, age);
			size++;
		} else {
			// if list is not empty
			StudentNode newNode = new StudentNode(rollNumber, name, age);
			newNode.next = head;
			head = newNode;
			size++;
		}
	}

	// to add student at end of list
	public void addStudentAtEnd(String rollNumber, String name, int age) {
		if (head == null) {
			// if list is empty
			head = tail = new StudentNode(rollNumber, name, age);
			size++;
		} else {
			// if list is not empty
			StudentNode newNode = new StudentNode(rollNumber, name, age);
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// to add student at a specific position
	public void addStudentAtPosition(String rollnumber, String name, int age, int position) {
		if (position < 0 || position > size) {
			// check for invalid index for insert
//			throw new ArrayIndexOutOfBoundsException();
			System.out.println("Invalid index!");
		} else if (position == 0) {
			// position 0 means start of list
			addStudentAtBeginning(rollnumber, name, age);
		} else if (position == size) {
			// position size means end of list
			addStudentAtEnd(rollnumber, name, age);
		} else {
			StudentNode temp = head;
			int i = 0;
			while (i < position - 1) {
				i++;
				temp = temp.next;
			}
			StudentNode newNode = new StudentNode(rollnumber, name, age);
			newNode.next = temp.next;
			temp.next = newNode;
			size++;
		}
	}

	// private method to search for a node
	private final StudentNode findStudent(String rollNumber) {
		StudentNode temp = head;
		while (temp != null && !temp.hasRollNumber(rollNumber)) {
			temp = temp.next;
		}

		return temp;
	}

	// to display all students
	public void displayAll() {
		StudentNode temp = head;
		System.out.println("Student records: \n");
		if (temp == null) {
			System.out.println("No student");
		} else {
			while (temp != null) {
				temp.display();
				temp = temp.next;
			}
		}
	}

	// to display a specific student
	public void displayStudent(String rollnumber) {
		StudentNode node = findStudent(rollnumber);
		System.out.println("Student record: \n");
		if (node == null) {
			System.out.println("No student with rollnumber " + rollnumber);
		} else {
			node.display();
		}
	}

	// to delete a student
	public void deleteStudent(String rollNumber) {
		StudentNode temp = head;
		
		if (temp.hasRollNumber(rollNumber)) {
			// if the node to be deleted is the head then move head
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
		} else {
			while (temp.next != null && !temp.next.hasRollNumber(rollNumber)) {
				temp = temp.next;
			}

			if (temp.next != null) {
				if (temp.next == tail) {
					// if the node to be deleted is tail move tail
					tail = temp;
				}
				temp.next = temp.next.next;
				size--;
			}
		}
	}

	// to update grade for a student
	public void updateGrade(String rollNumber, String grade) {
		StudentNode node = findStudent(rollNumber);

		if (node == null) {
			System.out.println("Student not found");
		} else {
			node.setGrade(grade);
		}
	}
}
