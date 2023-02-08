package br.com.ada.polotech925;

import java.io.*;
import java.util.List;
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
    public void saveFile(String directory, String content, String type, String nameFile) {
        String dir = "";
        switch (type) {
            case "REMINDER" -> {
                dir = "reminder";
            }
            case "IMPORTANT" -> {
                dir = "important";
            }
            case "IMAGE" -> {
                dir = "image";
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

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void listAllFiles(String directory) {

    }
}
