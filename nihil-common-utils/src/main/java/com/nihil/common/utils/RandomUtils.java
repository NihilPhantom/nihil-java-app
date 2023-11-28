package com.nihil.common.utils;

import java.util.UUID;

public class RandomUtils {
    public static String uuid(){
        // 生成 UUID
        UUID uuid = UUID.randomUUID();

        // 获取 UUID 的字符串表示形式，并去掉其中的连接符“-”
        return uuid.toString().replace("-", "");
    }
}
