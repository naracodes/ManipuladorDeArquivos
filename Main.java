import br.com.ada.polotech925.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo ao Gerenciador de Arquivos");
        switch (montarOpcoesMenu()){
            case 1:
                System.out.println("Digite o caminho: ");
                String path = scanner.nextLine();
               int opcao = montarOpcoesFolders();
               if (opcao == 1){
                   path += "/reminders/";
               } else if (opcao == 2) {
                    path += "/importants/";
                } else if (opcao == 3) {
                    path += "";
                } else if (opcao == 4) {
                    path += "/images/";
                }
                FolderManagement fM = new FolderOrchestrator();
                fM.createFolder(path);
                break;
            case 2:
                MFile mFile = new MFile();
                int type = montarOpcoesFolders();
                if (type == 1){
                    mFile.setType("REMINDER");
                } else if (type == 2) {
                    mFile.setType("IMPORTANT");
                } else if (type == 3) {
                    mFile.setType("SIMPLE");
                } else if (type == 4) {
                    System.out.println("Opção não permitida para arquivo txt.");
                    break;
                }
                System.out.println("Digite o caminho do diretorio: ");
                mFile.setPath(scanner.nextLine());
                System.out.println("Digite o conteudo: ");
                mFile.setContent(scanner.nextLine());
                System.out.println("Digite o nome do arquivo: ");
                mFile.setNameFile(scanner.nextLine());

                FileDatabase fO = new FileOrchestrator();
                fO.saveFile(mFile.getPath(), mFile.getContent(), mFile.getType(), mFile.getNameFile());
                break;
            case 3:
                System.out.println("Salvar Imagem.");
                break;
            case 4:
                System.out.println("Digite o caminho do diretorio: ");
                path = scanner.nextLine();
                System.out.println("Digite o nome do arquivo: ");
                String nameFile = scanner.nextLine();
                fO = new FileOrchestrator();
                fO.recoveryFile(path, nameFile);
                break;
            case 5:
                System.out.println("Listar imagens.");
                break;
            case 6:
                opcao = montarOpcoesFolders();
                String tipo = null;
                if (opcao == 1){
                    tipo = "reminders";
                } else if (opcao == 2) {
                    tipo = "importants";
                } else if (opcao == 3) {
                    tipo = "";
                } else if (opcao == 4) {
                    tipo = "images";
                }
                System.out.println("Remover arquivos.");
                System.out.println("Digite o caminho do diretorio: ");
                path = scanner.nextLine();
                System.out.println("Digite o nome do arquivo: ");
                nameFile = scanner.nextLine();
                fO = new FileOrchestrator();
                fO.removeFile(path, nameFile, tipo);
                break;
            case 7:
                System.out.println("Remover imagens");
                break;
            case 8:
                System.out.println("Digite o caminho do diretorio: ");
                path = scanner.nextLine();
                FolderManagement fM2 = new FolderOrchestrator();
                fM2.removeFolder(path);
                break;
            default:
                System.out.println("Opção inválida");
        }

    }

    public static int montarOpcoesFolders(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ESCOLHA UM DOS TIPOS");
        System.out.println("1- REMINDER");
        System.out.println("2- IMPORTANT");
        System.out.println("3- SIMPLE");
        System.out.println("4- IMAGE");
        System.out.println("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        return opcao;
    }

    public static int montarOpcoesMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------MENU-----------");
        System.out.println("1- Criar Pasta ok");
        System.out.println("2- Salvar arquivo txt ok");
        System.out.println("3- Salvar imagem");
        System.out.println("4- Listar arquivos txt ok");
        System.out.println("5- Listar imagens");
        System.out.println("6- Remover arquivos txt ok");
        System.out.println("7- Remover imagens");
        System.out.println("8- Remover Pasta ok");
        System.out.println("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        return opcao;
    }
}
