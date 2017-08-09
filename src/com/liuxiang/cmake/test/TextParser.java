package com.liuxiang.cmake.test;

import java.util.Arrays;

/**
 * Created by xiang on 2017/8/6.
 */
//CmakeRequired = "cmake_minimum_required" .*
//        CmakeVersion = "VERSION" .*
//        {CmakeRequired}    {  yybegin(YYINITIAL);return new CmakeElementType(CmakeElementType.TYPE_REQUIRED,CmakeLanguage.CMAKE); }
//        {CmakeVersion} {  yybegin($CmakeRequired);return new CmakeElementType(CmakeElementType.TYPE_VERSION,CmakeLanguage.CMAKE); }
public class TextParser {
    public static void main(String[] args) {
//        [^(\ \n\t\f\\)] | "\\ "
        System.out.println(Arrays.toString("A(111)".split("[^(\n\t\f\\)]")));
        String[] split = "cmake_minimum_required(VERSION)".split("[^.*?!(]([.*?!(])");
        System.out.println(Arrays.toString(split));
//        String input = "# dfsadfadsa()\ncmake_minimum_required(VERSION 3.1 )";
//        FlexAdapter lexer = new FlexAdapter(new _Cmake_highlightLexer());
//        lexer.start(input);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(lexer.getTokenType());
//            lexer.advance();
//        }
    }
}
