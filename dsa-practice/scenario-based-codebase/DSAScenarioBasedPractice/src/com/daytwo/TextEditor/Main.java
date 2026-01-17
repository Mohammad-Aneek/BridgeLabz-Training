package com.daytwo.TextEditor;

public class Main {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();

		editor.insert("Hello");
		System.out.println(editor);

		editor.insert(" World");
		System.out.println(editor);

		editor.delete(6);
		System.out.println(editor);

		System.out.println("Undo: " + editor.undo());
		System.out.println(editor);

		System.out.println("Undo: " + editor.undo());
		System.out.println(editor);

		System.out.println("Redo: " + editor.redo());
		System.out.println(editor);

		System.out.println("Undo: " + editor.undo());
		System.out.println(editor);

		editor.insert("Java");
		System.out.println(editor);

		System.out.println("Redo: " + editor.redo());
	}
}
