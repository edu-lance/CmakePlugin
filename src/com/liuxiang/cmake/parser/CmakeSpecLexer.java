package com.liuxiang.cmake.parser;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeSpecLexer extends FlexAdapter {
    public CmakeSpecLexer() {
        super(new _CmakeSpecLexer(null));
    }
}
