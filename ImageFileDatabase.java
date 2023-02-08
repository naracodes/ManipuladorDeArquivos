package br.com.ada.polotech925;

public interface ImageFileDatabase {
    void saveImageFile(String directory, String content, String nameFile);
    void recoveryImageFile(String directory);
    void removeImageFile(String directory, String nameFile);
    void listAllImageFile(String directory);
}
