package com.ejpm.euler.utils.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class FileReaderUtils {

  public static Integer[][] readMatrixFromFile(final String fileName) {
    final Path path = Paths.get(Objects.requireNonNull(FileReaderUtils.class.getClassLoader().getResource(fileName)).getPath());
    try {
      List<String> listOfStrings = Files.readAllLines(path);
      int lines = listOfStrings.size();
      int columns = listOfStrings.get(listOfStrings.size() - 1).split(" ").length;

      Integer[][] matrix = new Integer[lines][columns];
      for (int i = 0; i < lines; i++) {
        Integer [] lineMatrix = Stream.of(listOfStrings.get(i).split(" "))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
        System.arraycopy(lineMatrix, 0, matrix[i], 0, lineMatrix.length);
      }

      return matrix;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
