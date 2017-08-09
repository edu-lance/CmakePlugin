package com.liuxiang.cmake;


import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import com.liuxiang.cmake.icon.CmakeIcon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeFileType extends LanguageFileType {

    public static CmakeFileType INSTANCE = new CmakeFileType();

    protected CmakeFileType() {
        super(CmakeLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Cmake file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cmake configuration file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CmakeIcon.ICON;
    }
}
