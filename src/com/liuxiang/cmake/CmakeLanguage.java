package com.liuxiang.cmake;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeLanguage extends Language {

    public static CmakeLanguage CMAKE = new CmakeLanguage("cmake");

    protected CmakeLanguage(@NotNull String ID) {
        super(ID);
    }
}
