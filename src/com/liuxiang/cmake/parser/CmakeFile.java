package com.liuxiang.cmake.parser;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.liuxiang.cmake.CmakeFileType;
import com.liuxiang.cmake.CmakeLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/9.
 */
public class CmakeFile extends PsiFileBase {
    protected CmakeFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CmakeLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CmakeFileType.INSTANCE;
    }

}
