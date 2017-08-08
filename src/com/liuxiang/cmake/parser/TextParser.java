package com.liuxiang.cmake.parser;

/**
 * Created by xiang on 2017/8/6.
 */
//CmakeRequired = "cmake_minimum_required" .*
//        CmakeVersion = "VERSION" .*
//        {CmakeRequired}    {  yybegin(YYINITIAL);return new CmakeElementType(CmakeElementType.TYPE_REQUIRED,CmakeLanguage.CMAKE); }
//        {CmakeVersion} {  yybegin($CmakeRequired);return new CmakeElementType(CmakeElementType.TYPE_VERSION,CmakeLanguage.CMAKE); }
public class TextParser {
    public static void main(String[] args) {
        String input = "# dfsadfadsa()\ncmake_minimum_required(VERSION 1)";
        CmakeSpecLexer lexer = new CmakeSpecLexer();
        lexer.start(input);
        for (int i = 0; i < 10; i++) {
            System.out.println(lexer.getTokenType());
            lexer.advance();
        }
    }
}
