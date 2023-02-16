package br.com.ada.polotech925;

public class MFile {
    private String content;
    private String nameFile;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String path;
    private MFileAnnotationTypeEnum type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public MFileAnnotationTypeEnum getType() {
        return type;
    }

    public void setType(MFileAnnotationTypeEnum type) {
        this.type = type;
    }
}
