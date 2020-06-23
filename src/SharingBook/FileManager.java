package SharingBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class FileManager<T> {

	private String filename;

	public FileManager(String filename) {
		this.filename = filename;
	}

	private boolean isFileExists() {
		File file = new File(filename);
		return file.exists();
	}

	public void write(Set<T> object) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.filename))) {
			objectOutputStream.writeObject(object);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Set<T> read() {
		if (!isFileExists()) {
			return new HashSet<T>();
		}

		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(this.filename))) {
			return (Set<T>) objectInputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return new HashSet<T>();
		}
	}
}
