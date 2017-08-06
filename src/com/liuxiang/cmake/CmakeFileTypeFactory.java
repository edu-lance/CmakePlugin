package com.liuxiang.cmake;

import com.intellij.openapi.fileTypes.FileNameMatcher;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeFileTypeFactory extends FileTypeFactory {
    static final String CMAKE_FILE_NAME = "CMakeLists.txt";
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(new CmakeFileType(CmakeLanguage.CMAKE), new FileNameMatcher() {
            @Override
            public boolean accept(@NotNull String s) {
                return s.equals(CMAKE_FILE_NAME);
            }

            @NotNull
            @Override
            public String getPresentableString() {
                return CMAKE_FILE_NAME;
            }
        });
    }
}
