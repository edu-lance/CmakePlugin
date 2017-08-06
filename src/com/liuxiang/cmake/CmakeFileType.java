package com.liuxiang.cmake;


import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeFileType extends LanguageFileType {

    protected CmakeFileType(@NotNull Language language) {
        super(language);
    }

    @NotNull
    @Override
    public String getName() {
        return "cmake";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "cmake file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("/com/liuxiang/cmake/icon.png");
    }
}
