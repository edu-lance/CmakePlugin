package com.liuxiang.cmake.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.liuxiang.cmake.CmakeLanguage;

%%

%class _CmakeSpecLexer
%implements FlexLexer
%unicode
%type IElementType
%function advance
%{
private String matchedText() {
    return yytext().toString();
}
%}

Comment = "#" .*
LineSeparator = \r\n | \r | \n
CmakeRequired = "cmake_minimum_required"
CmakeVersion = "VERSION"
CmakeIncludeDirectories = "include_directories"


%%

{Comment}          { return new CmakeElementType(CmakeElementType.TYPE_COMMENT,matchedText(),CmakeLanguage.CMAKE); }
{LineSeparator}    { return new CmakeElementType(CmakeElementType.TYPE_LINESEPARATOR,CmakeLanguage.CMAKE); }
{CmakeRequired}    { return new CmakeElementType(CmakeElementType.TYPE_REQUIRED,CmakeLanguage.CMAKE); }
{CmakeVersion} { return new CmakeElementType(CmakeElementType.TYPE_VERSION,CmakeLanguage.CMAKE); }
{CmakeIncludeDirectories} { return new CmakeElementType(CmakeElementType.TYPE_INCLUDE_DIRECTORIES,CmakeLanguage.CMAKE); }


