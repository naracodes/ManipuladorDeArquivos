package br.com.ada.polotech925;

public interface FileDatabase {
    void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile);
    void recoveryFile(String directory, String nameFile);
    void removeFile(String directory, String nameFile, String type);
    void listAllFiles(String directory);
}
