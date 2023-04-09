package com.gdx.game.audio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mp4ToMp3Converter {

    public static void convertMp4ToMp3(String inputMp4FilePath, String outputMp3FilePath) {
        File inputFile = new File(inputMp4FilePath);
        File outputFile = new File(outputMp3FilePath);

        if (!inputFile.exists()) {
            System.err.println("Le fichier d'entrée n'existe pas.");
            return;
        }

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("ffmpeg", "-i", inputMp4FilePath, "-vn", "-ar", "44100", "-ac", "2", "-ab", "192k", "-f", "mp3", outputMp3FilePath);
            Process process = processBuilder.start();

            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line;
            while ((line = errorReader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
            errorReader.close();

            if (outputFile.exists()) {
                System.out.println("Conversion terminée avec succès.");
            } else {
                System.err.println("La conversion a échoué.");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
