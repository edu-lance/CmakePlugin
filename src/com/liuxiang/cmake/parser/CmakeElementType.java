package com.liuxiang.cmake.parser;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeElementType extends IElementType {

    public static final  String TYPE_COMMENT = "Comment";
    public static final  String TYPE_LINESEPARATOR = "LineSeparator";
    public static final  String TYPE_REQUIRED = "CmakeRequired";
    public static final  String TYPE_VERSION = "CmakeVersion";
    public static final  String TYPE_INCLUDE_DIRECTORIES = "CmakeIncludeDirectories";


    private String debugName;
    private String value;

    public CmakeElementType(@NotNull String debugName, String value, @Nullable Language language) {
        super(debugName, language);
        this.debugName = debugName;
        this.value = value;
    }

    public CmakeElementType(@NotNull String debugName, @Nullable Language language) {
        super(debugName, language);
        this.debugName = debugName;
    }

    private String getValue() {
        return value == null ? "" : "(" + value + ")";
    }

//    @Override
//    public String toString() {
//        return debugName + getValue();
//    }
}
