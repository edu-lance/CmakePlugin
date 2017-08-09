package com.liuxiang.cmake;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeLanguage extends Language {

    public static CmakeLanguage INSTANCE = new CmakeLanguage();

    protected CmakeLanguage() {
        super("cmake");
    }
}
