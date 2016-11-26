package com.manning.ch02;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import static org.junit.Assert.*;

public class TemporaryFolderTest {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void thisTempFileIsSquashedAfterTheTest() throws Exception {
		File tempFile = folder.newFile("myTempFile.txt");
		assertTrue(tempFile.exists());
	}

	@Test
	public void allJunkWillBeGoneAfterTheTestHasRun() {
		File tempDir = null;
		try {
			tempDir = folder.newFolder("myTempDir");
		} catch (IOException e) {
			e.printStackTrace();
		}
		createRandomJunkIn(new File(tempDir, "mah-junk.txt"));
		createRandomJunkIn(new File(tempDir, "moar-junk.txt"));
	}

	private void createRandomJunkIn(File file) {
		try {
			new FileWriter(file).write(new Random().nextInt());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
