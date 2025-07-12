package org.scoula.board.common.util;

public class UploadFileName {
    public static String getUniqueName(String filename) {
        int ix = filename.lastIndexOf(".");
        String name = filename.substring(0, ix); String ext = filename.substring(ix+1); // 파일명 추출
        // 확장명 추출
        return String.format("%s-%d.%s", name, System.currentTimeMillis(), ext);
    }

}