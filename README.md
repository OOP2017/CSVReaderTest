# JUnit Tests for CSVReader

This repository contains JUnit tests for the CSVReader assignment.

* `EasyCSVReaderTest.java` - uses test cases like in the assignment sheet, with some tests that CSVReader skips blank lines and comment lines.

* `BigCSVReaderTest.java` - more detailed tests of CSVReader.

These tests require:

1. You have a `CSVReader.java` class in the `ku.util` package, and it has the constructor and methods specified in the assignment.
2. The JUnit 4 libraries on your project classpath.

Eclipse, Netbeans, and BlueJ come with the JUnit 4 library.
For Eclipse nad Netbeans, when you add the JUnit test source files to your project you will get an error message about missing classes.  
Use "fix project setup" (or "Configure Build Path") to add JUnit 4 to your project.

In Eclipse, if your project contains JUnit tests but doesn't have the JUnit library, Eclipse will flag errors because the project doesn't have the JUnit library.  Open one of the JUnit test sources and put the cursor on a line that has an error (like `import org.junit.*`). Press CTRL-1 which means "quick fix".  Eclipse will show a dialog of fixes.  Choose "Fix project setup".

### Eclipse, Netbeans, IntelliJ

Most developers use two "source" directories in a project:

* `src/` - contains the main source code
* `test/` - contains test code

If you want to do this, you have to tell the IDE to use 2 source dirs.  

* First, add the test code to a folder named `test`. The test folder should have the same directory structure as your main `src` folder. (See below)
* In Eclipse, open the dialog for Project -> Properties and choose "Java Build Path".  Select the "Source" tab.  Click "Add Folder..." and add the test folder.  Exit the dialog.
* Now, Eclipse will compile and run files in both the `src` and `test` folders.

### Add these Tests to your Project

**Please don't "commit" the JUnit test files to your Git repo.**

#### 1. Just add the files to project (the simple way)

Just copy the files to your project source directory (or `test/` source directory). 
You should have files like this, relative to your project source root: 
```
README.md
ku/util/
ku/util/BigCSVReaderTest.java
ku/util/EasyCSVReaderTest.java
```
If the test code is in a `test/` source tree, then you'll have:
```
test/README.md
test/ku/util/
test/ku/util/BigCSVReaderTest.java
```

#### 2. Using git submodule (the advanced way)

The Git repository for CSVReaderTest is structured as a Git submodule.
Git submodules let you add a Git repository inside another Git repository, but keep the two sets of files separate.  Here are the steps:

1. change directory to your CSVReader project
    ```
    > cd /workspace/csvreader
    ```
2. add the CSVReaderTest as a submodule, and put the files in a subdirectory named "test".  IMPORTANT: don't forget the "test" parameter on command line.
   ```
   > git submodule add https://github.com/OOP2017/CSVReaderTest.git test
   ```
   This should add files to the "test" directory.

3. If you _don't_ have any files in the test directory then do this:
   ```
   > git submodule init
   > git submodule update
   ```

### Running the Tests

Two ways: 

* Run as JUnit tests in your IDE.  Usually you right-click on the test file to run and choose "Run JUnit test".

* Run `TestRunner` as ordinary Java appliation. This will run both test suites.
