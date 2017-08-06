package com.liuxiang.cmake.parser;

/**
 * Created by xiang on 2017/8/6.
 */
public class TextParser {
    public static void main(String[] args) {
        String input = "# dfsadfadsa\r\r\n \n cmake_minimum_required(VERSION 3.4.1)";
        CmakeSpecLexer lexer = new CmakeSpecLexer();
        lexer.start(input);
        for (int i = 0; i < 10; i++) {
            System.out.println(lexer.getTokenType());
            lexer.advance();
        }
    }
}
