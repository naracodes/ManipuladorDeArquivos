package br.com.ada.polotech925;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FolderOrchestrator implements FolderManagement{
    public void createFolders(List<String> mListPaths){

    }

    public void removeFolders(List<String> mListPaths){

    }

    @Override
    public void createFolder(String path) {
        File file = new File(path);

        if (!file.exists()) {
            file.mkdirs();
            System.out.println("Diretório criado com sucesso!");
        }else{
            System.out.println("Esse diretório já existe!");
        }
    }

    @Override
    public void removeFolder(String path) {
        File file = new File(path);
        file.delete();
    }

    @Override
    public void listAllFoldersCreated() {

    }
}
