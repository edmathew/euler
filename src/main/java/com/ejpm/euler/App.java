package com.ejpm.euler;

import com.ejpm.euler.problem.Problem;

import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(final String[] args) {
    System.out.println("Project Euler Solutions");
    new App().executeProblems();
    System.out.println("DONE");
  }


  public void executeProblems() {
    final String classPackage = "com.ejpm.euler.problem.impl";

    for (int i = 0; i < 900; i++) {
      final String className = classPackage.concat(".Problem") + i;
      try {
        final Class<?> c = Class.forName(className);
        final Problem problem = (Problem) c.newInstance();
        problem.execute();
      } catch (ClassNotFoundException ex) {
      } catch (InstantiationException | IllegalAccessException ex) {
        LOGGER.error(String.format("Error creating class for Problem %d", i));
        java.util.logging.Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
}
