package Slip5;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

public class Q2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file or directory path as a command line argument.");
            return;
        }

        String path = args[0];
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified file or directory does not exist.");
            return;
        }

        if (file.isDirectory()) {
            System.out.println("The specified path is a directory.");
            File[] files = file.listFiles();

            if (files != null) {
                System.out.println("Contents of the directory:");
                for (File f : files) {
                    System.out.println(f.getName());
                }

                int fileCount = files.length;
                System.out.println("Number of files in the directory: " + fileCount);

                // Ask the user if files should be deleted
                System.out.print("Do you want to delete files with the '.txt' extension? (y/n): ");
                String response = System.console().readLine();

                if (response.equalsIgnoreCase("y")) {
                    for (File f : files) {
                        if (f.getName().toLowerCase().endsWith(".txt")) {
                            f.delete();
                        }
                    }
                    System.out.println("Files with the '.txt' extension have been deleted.");
                } else {
                    System.out.println("No files were deleted.");
                }
            }
        } else {
            System.out.println("The specified path is a file.");
            System.out.println("File information:");
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");

            try {
                BasicFileAttributes attributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                System.out.println("Creation Time: " + attributes.creationTime());
                System.out.println("Last Accessed Time: " + attributes.lastAccessTime());
                System.out.println("Last Modified Time: " + attributes.lastModifiedTime());
                System.out.println("Is Directory: " + attributes.isDirectory());
                System.out.println("Is Regular File: " + attributes.isRegularFile());
                System.out.println("Is Symbolic Link: " + attributes.isSymbolicLink());
                System.out.println("Is Other: " + attributes.isOther());
            } catch (Exception e) {
                System.out.println("Failed to retrieve file attributes: " + e.getMessage());
            }
        }
    }
}