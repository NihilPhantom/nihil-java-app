package com.nihil.common.file;

import java.util.HashMap;

public class FileConst {

    // 文件类型
    public static final String TYPE_ROOT = "ROOT";
    public static final String TYPE_FOLDER = "FOLDER";
    public static final String TYPE_Markdown = "markdown";

    // 文件存储类型
    public static final String STYPE_NONE = "none";
    public static final String STYPE_MeiliSearch = "meilisearch";
    public static final String STYPE_MinIO = "minio";
    public static final String STYPE_FS = "fs";
    public static final String STYPE_Mysql = "mysql";

    // 注册 FS Bean 的前缀
    public static final String File_Service_Prefix = "fileService_";

    // 文件移动类型
    public static final String FileMove_Inner = "inner";
    public static final String FileMove_Before = "before";
    public static final String FileMove_After = "after";


    // 文件类型映射表
    // 创建HashMap对象，用于存储文件后缀名和对应的文件类型
    public static final HashMap<String, String> FileTypes = new HashMap<>(){{
        // 文档类文件
        put(".doc", "document");
        put(".docx", "document");
        put(".pdf", "document");
        put(".txt", "document");
        put(".rtf", "document");
        put(".odt", "document");
        put(".ppt", "document");
        put(".pptx", "document");
        put(".xls", "document");
        put(".xlsx", "document");
        // 图片类文件
        put(".jpg", "picture");
        put(".jpeg", "picture");
        put(".png", "picture");
        put(".gif", "picture");
        put(".bmp", "picture");
        put(".svg", "picture");
        // 音频类文件
        put(".mp3", "audio");
        put(".wav", "audio");
        put(".aac", "audio");
        put(".wma", "audio");
        // 视频类文件
        put(".mp4", "video");
        put(".avi", "video");
        put(".mov", "video");
        put(".wmv", "video");
        put(".flv", "video");
        // 压缩文件
        put(".zip", "archive");
        put(".rar", "archive");
        put(".7z", "archive");
        // 程序源代码文件
        put(".java", "code");
        put(".cpp", "code");
        put(".py", "code");
        put(".js", "code");
        // 网页文件
        put(".html", "webpage");
        put(".htm", "webpage");
        put(".css", "webpage");
        // 其他常见文件
        put(".exe", "other");
        put(".dll", "other");
        put(".iso", "other");
        put(".torrent", "other");
        put(".bak", "other");
    }};



}
