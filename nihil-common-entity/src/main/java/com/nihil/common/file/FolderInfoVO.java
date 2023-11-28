package com.nihil.common.file;

import java.util.List;

public class FolderInfoVO {
    List<FileNodeDO> childFiles;
    String folderName;
    Long folderId;
    int fileNum;

    public List<FileNodeDO> getChildFiles() {
        return childFiles;
    }

    public void setChildFiles(List<FileNodeDO> childFiles) {
        this.childFiles = childFiles;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public Long getFolderId() {
        return folderId;
    }

    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    public int getFileNum() {
        return fileNum;
    }

    public void setFileNum(int fileNum) {
        this.fileNum = fileNum;
    }
}
