package com.liuxiang.cmake.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by xiang on 2017/8/9.
 */
public class CmakeLexerAdapter extends FlexAdapter {
    public CmakeLexerAdapter() {
        super(new CmakeLexer((Reader) null));
    }
}
