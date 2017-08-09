package com.liuxiang.cmake.psi;

import com.intellij.psi.tree.IElementType;
import com.liuxiang.cmake.CmakeLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/9.
 */
public class CmakeTokenType extends IElementType {
    public CmakeTokenType(@NotNull String debugName) {
        super(debugName, CmakeLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CmakeTokenType." + super.toString();
    }
}
