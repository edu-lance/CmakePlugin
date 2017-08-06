package com.liuxiang.cmake.highlight;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.liuxiang.cmake.parser.CmakeElementType;
import com.liuxiang.cmake.parser.CmakeSpecLexer;
import org.jetbrains.annotations.NotNull;

/**
 * Created by xiang on 2017/8/6.
 */
public class CmakeHighlighter extends SyntaxHighlighterBase {
    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CmakeSpecLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {

        String type = iElementType.toString();
        if (null == type) {
            type = "unknow";
        }
        switch (type) {
            case CmakeElementType.TYPE_COMMENT:
                return new TextAttributesKey[]{DefaultLanguageHighlighterColors.LINE_COMMENT};
            case CmakeElementType.TYPE_REQUIRED:
            case CmakeElementType.TYPE_VERSION:
                return new TextAttributesKey[]{DefaultLanguageHighlighterColors.KEYWORD};
            case CmakeElementType.TYPE_INCLUDE_DIRECTORIES:
                return new TextAttributesKey[]{DefaultLanguageHighlighterColors.FUNCTION_CALL};
        }
        return new TextAttributesKey[0];
    }

//    String getKey(String type){
//        switch (type){
//            case CmakeElementType.TYPE_COMMENT:
//                return  DefaultLanguageHighlighterColors.INSTANCE_FIELD;
//        }
//    }

}
