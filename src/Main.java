
import javax.swing.JFileChooser;

import java.io.File;

import java.io.FileReader;

import java.io.BufferedReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        JFileChooser chooser = new JFileChooser();

        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            int lineCount = 0;

            int wordCount = 0;

            int charCount = 0;

            while((line = br.readLine()) != null) {

                lineCount++;

                String[] words = line.split(" ");

                wordCount += words.length;

                charCount += line.length();

            }

            System.out.println("File name: " + file.getName());

            System.out.println("Number of lines: " + lineCount);

            System.out.println("Number of words: " + wordCount);

            System.out.println("Number of characters: " + charCount);

        }

    }

}





