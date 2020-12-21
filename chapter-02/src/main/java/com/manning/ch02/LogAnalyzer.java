package com.manning.ch02;

public class LogAnalyzer {
	private static final String NO_FILENAME_PROVIDED = "No filename provided!";

	public boolean isValidLogFileName(String fileName) {
		if (fileName == null || fileName.length() == 0) {
			throw new IllegalArgumentException(NO_FILENAME_PROVIDED);
		}
		return fileName.toLowerCase().endsWith(".slf");
	}
}
