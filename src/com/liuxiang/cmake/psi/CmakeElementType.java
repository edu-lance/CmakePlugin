package com.liuxiang.cmake.psi;

import com.intellij.psi.tree.IElementType;
import com.liuxiang.cmake.CmakeLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeElementType extends IElementType {

    public static final CmakeElementType COMMENT = new CmakeElementType("COMMENT");
    public static final CmakeElementType KEY = new CmakeElementType("KEY");
    public static final CmakeElementType METHOD = new CmakeElementType("METHOD");


//    private String debugName;
//    private String value;

//    public CmakeElementType(@NotNull String debugName, String value) {
//        super(debugName, CmakeLanguage.INSTANCE);
//        this.debugName = debugName;
//        this.value = value;

//    }

    public CmakeElementType(@NotNull String debugName) {
        super(debugName, CmakeLanguage.INSTANCE);
//        this.debugName = debugName;
    }

//    private String getValue() {
//        return value == null ? "" : "(" + value + ")";
//    }

//    @Override
//    public String toString() {
//        return debugName + getValue();
//    }
}
