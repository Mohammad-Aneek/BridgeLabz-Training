package com.daytwo.TextEditor;

import java.util.Stack;

public class TextEditor {
	private StringBuilder text;
	private Stack<StringBuilder> undoStack;
	private Stack<StringBuilder> redoStack;

	public TextEditor() {
		text = new StringBuilder();
		undoStack = new Stack<StringBuilder>();
		redoStack = new Stack<StringBuilder>();
	}

	public boolean insert(String text) {
		undoStack.add(new StringBuilder(this.text));
		redoStack.clear();

		this.text.append(text);
		return true;
	}

	public boolean delete(int charCount) {
		int length = text.length();
		if (charCount > length) {
			return false;
		}
		undoStack.add(new StringBuilder(this.text));
		redoStack.clear();
		text.delete(length - charCount, length);
		return true;
	}

	public boolean undo() {
		if (undoStack.isEmpty()) {
			return false;
		} else {
			redoStack.add(new StringBuilder(this.text));
			text = undoStack.pop();
			return true;
		}
	}

	public boolean redo() {
		if (redoStack.isEmpty()) {
			return false;
		} else {
			undoStack.add(new StringBuilder(this.text));
			text = redoStack.pop();
			return true;
		}
	}
	
	@Override
	public String toString() {
		return text.toString();
	}
}
