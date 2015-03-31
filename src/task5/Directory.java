package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class Directory {
  /**
   * Lists what is inside the given directory and if it is  a file or directory.
   *
   * @param a The name of the directory that we want to check.
   * @throws IOException If there is a problem with finding the directory.
   */
  public void list(String a) throws IOException {
    Path dir = Paths.get(a);
    if (!Files.isDirectory(dir)) {
      System.out.println("Tova e Fail");
    } else {
      DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
      for (Path file : stream) {
        if (Files.isDirectory(file)) {
          System.out.printf("%-70s -----This is a Directory-----\n", file.toAbsolutePath());
        } else {
          System.out.printf("%-70s  -----This is a File-----\n", file.toAbsolutePath());
        }
      }
    }
  }

  /**
   * Lists what is inside the given directory and if it is  a file or directory using java.io.file.
   *
   * @param a The name of the directory that we want to check.
   * @throws FileNotFoundException if there is no such file.
   */
  public void listWithIOFile(String a) throws FileNotFoundException {
    File file = new File(a);
    if (!file.exists()) {
      throw new FileNotFoundException("The file is missing");
    }
    if (!file.isDirectory()) {
      throw new FileNotFoundException("This is a file!");
    }
    File[] list = file.getAbsoluteFile().listFiles();
    for (File at : list) {
      if (at.isDirectory()) {
        System.out.printf("%-70s Directory!\n", at.getAbsolutePath());
      } else {
        System.out.printf("%-70s File!\n", at.getAbsolutePath());
      }
    }
  }
}



