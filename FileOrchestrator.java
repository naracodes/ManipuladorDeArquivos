package br.com.ada.polotech925;

import java.io.*;
import java.util.List;
import java.util.Scanner;

import br.com.ada.polotech925.MFileAnnotationTypeEnum;

public class FileOrchestrator extends FolderOrchestrator implements FileDatabase, ImageFileDatabase {

    public void saveAllListOfFiles(List<MFile> mFileList){

    }

    public void saveAllListOfImageFiles(List<MFile> mImageFileList){

    }

    @Override
    public void saveImageFile(String directory, String content, String nameFile) {


    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {

    }

    @Override
    public void listAllImageFile(String directory) {

    }

    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {
        String dir = "";
        switch (type) {
            case REMINDER -> {
                dir = "reminders";
            }
            case IMPORTANT -> {
                dir = "importants";
            }
            case IMAGE -> {
                dir = "images";
            }
            default -> {
                dir = "";
            }
        }
        String path = directory + "//" + dir + "//" + nameFile + ".txt";

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"))){
            writer.write(content);
            System.out.println("Arquivo criado e escrito com sucesso!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Erro ao tentar criar e escrever o arquivo.");
        }
    }

    @Override
    public void recoveryFile(String directory, String nameFile) {
        directory = directory + "//" + nameFile + ".txt";
        File textFile = new File(directory);
        Scanner in = null;
        try {
            in = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Nome do arquivo: " + nameFile + ".txt" );
        System.out.println("Conteudo:");
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();

    }

    @Override
    public void removeFile(String directory, String nameFile, String type) {
        directory = directory + "//" + type + "//" + nameFile + ".txt";
        File file = new File(directory);

        if (file.isFile()) {
            file.delete();
            System.out.println("Arquivo deletado com sucesso!");
        } else System.out.println("Arquivo não encontrado.");
    }

    @Override
    public void listAllFiles(String directory) {

    }

    public static boolean directoryExist(String directory){
        File file = new File(directory);
        if(file.exists()){
            return true;
        }else{
            return false;
        }
    }
}
