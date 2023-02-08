package br.com.ada.polotech925;

import javax.imageio.stream.ImageInputStream;

public class HandlerFile extends FileOrchestrator{


    ImageFileDatabase imageFileDatabase;
    FileDatabase fileDatabase;
    FolderManagement folderManagement;

    public HandlerFile() {
        imageFileDatabase = new FileOrchestrator();
        fileDatabase = new FileOrchestrator();
        folderManagement = new FolderOrchestrator();
    }


    public void saveWithDirectory(MFile mFile) {
        fileDatabase.saveFile(mFile.getPath(), mFile.getContent(), mFile.getType(), mFile.getNameFile());
    }

    public void saveImageWithDirectory(MFile mFile) {
        imageFileDatabase.saveImageFile(mFile.getPath(), mFile.getContent(), mFile.getNameFile());
    }

    public void listFiles(String directory){
        fileDatabase.listAllFiles(directory);
    }

    //public static Boolean createFile(HandlerFile handlerFile, MFileAnnotationTypeEnum typeEnum){

    //}
}