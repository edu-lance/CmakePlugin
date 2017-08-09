package com.liuxiang.cmake.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.liuxiang.cmake.psi.CmakeTypes;
import com.intellij.psi.TokenType;

%%

%class CmakeLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
NEW_LINE_INDENT = \r\n | \r | \n
Comment = "#" .*
//METHOD_CHARACTER=[^(\ \n\t\f\\)] | "\\ "
//%state WAITING_VALUE



%%

<YYINITIAL>{
 {Comment}                           {  return CmakeTypes.COMMENT; }
 {NEW_LINE_INDENT}                   {  return TokenType.NEW_LINE_INDENT; }


 "break"           {  return CmakeTypes.METHOD; }
 "cmake_host_system_information"           {  return CmakeTypes.METHOD; }
 "cmake_minimum_required"           {  return CmakeTypes.METHOD; }
 "cmake_parse_arguments"           {  return CmakeTypes.METHOD; }
 "configure_file"           {  return CmakeTypes.METHOD; }
 "cmake_policy"           {  return CmakeTypes.METHOD; }
 "continue"           {  return CmakeTypes.METHOD; }
 "elseif"           {  return CmakeTypes.METHOD; }
 "else"           {  return CmakeTypes.METHOD; }
 "endforeach"           {  return CmakeTypes.METHOD; }
 "endfunction"           {  return CmakeTypes.METHOD; }
 "endif"           {  return CmakeTypes.METHOD; }
 "endmacro"           {  return CmakeTypes.METHOD; }
 "endwhile"           {  return CmakeTypes.METHOD; }
 "execute_process"           {  return CmakeTypes.METHOD; }
 "file"           {  return CmakeTypes.METHOD; }
 "find_file"           {  return CmakeTypes.METHOD; }
 "find_library"           {  return CmakeTypes.METHOD; }
 "find_package"           {  return CmakeTypes.METHOD; }
 "find_path"           {  return CmakeTypes.METHOD; }
 "find_program"           {  return CmakeTypes.METHOD; }



 "foreach" {  return CmakeTypes.METHOD; }
 "function"   {  return CmakeTypes.METHOD; }
 "get_cmake_property" {  return CmakeTypes.METHOD; }
 "get_directory_property" {  return CmakeTypes.METHOD; }
 "get_filename_component" {  return CmakeTypes.METHOD; }
 "get_property" {  return CmakeTypes.METHOD; }
 "if" {  return CmakeTypes.METHOD; }
 "include" {  return CmakeTypes.METHOD; }
 "list" {  return CmakeTypes.METHOD; }
 "macro" {  return CmakeTypes.METHOD; }
 "mark_as_advanced" {  return CmakeTypes.METHOD; }
 "math" {  return CmakeTypes.METHOD; }
 "message" {  return CmakeTypes.METHOD; }
 "option" {  return CmakeTypes.METHOD; }
 "return" {  return CmakeTypes.METHOD; }
 "separate_arguments" {  return CmakeTypes.METHOD; }
 "set_directory_properties" {  return CmakeTypes.METHOD; }
 "set_property" {  return CmakeTypes.METHOD; }
 "set" {  return CmakeTypes.METHOD; }
 "site_name" {  return CmakeTypes.METHOD; }
 "string" {  return CmakeTypes.METHOD; }
 "unset" {  return CmakeTypes.METHOD; }
 "variable_watch" {  return CmakeTypes.METHOD; }
 "while" {  return CmakeTypes.METHOD; }



 "add_compile_options" {  return CmakeTypes.METHOD; }
 "add_custom_command" {  return CmakeTypes.METHOD; }
 "add_definitions" {  return CmakeTypes.METHOD; }
 "add_dependencies" {  return CmakeTypes.METHOD; }
 "add_executable" {  return CmakeTypes.METHOD; }
 "add_library" {  return CmakeTypes.METHOD; }
 "add_subdirectory" {  return CmakeTypes.METHOD; }
 "add_test" {  return CmakeTypes.METHOD; }
 "aux_source_directory" {  return CmakeTypes.METHOD; }
 "build_command" {  return CmakeTypes.METHOD; }
 "create_test_sourcelist" {  return CmakeTypes.METHOD; }
 "define_property" {  return CmakeTypes.METHOD; }
 "enable_language" {  return CmakeTypes.METHOD; }
 "enable_testing" {  return CmakeTypes.METHOD; }
 "export" {  return CmakeTypes.METHOD; }
 "fltk_wrap_ui" {  return CmakeTypes.METHOD; }
 "get_source_file_property" {  return CmakeTypes.METHOD; }
 "get_target_property" {  return CmakeTypes.METHOD; }
 "get_test_property" {  return CmakeTypes.METHOD; }
 "include_directories" {  return CmakeTypes.METHOD; }
 "include_external_msproject" {  return CmakeTypes.METHOD; }
 "include_regular_expression" {  return CmakeTypes.METHOD; }
 "install" {  return CmakeTypes.METHOD; }
 "link_directories" {  return CmakeTypes.METHOD; }
 "link_libraries" {  return CmakeTypes.METHOD; }
 "load_cache" {  return CmakeTypes.METHOD; }
 "project" {  return CmakeTypes.METHOD; }
 "qt_wrap_cpp" {  return CmakeTypes.METHOD; }
 "qt_wrap_ui" {  return CmakeTypes.METHOD; }
 "remove_definitions" {  return CmakeTypes.METHOD; }
 "set_source_files_properties" {  return CmakeTypes.METHOD; }
 "set_target_properties" {  return CmakeTypes.METHOD; }
 "set_tests_properties" {  return CmakeTypes.METHOD; }
 "source_group" {  return CmakeTypes.METHOD; }
 "target_compile_definitions" {  return CmakeTypes.METHOD; }
 "target_compile_features" {  return CmakeTypes.METHOD; }
 "target_compile_options" {  return CmakeTypes.METHOD; }
 "target_include_directories" {  return CmakeTypes.METHOD; }
 "target_link_libraries" {  return CmakeTypes.METHOD; }
 "target_sources" {  return CmakeTypes.METHOD; }
 "try_compile" {  return CmakeTypes.METHOD; }
 "try_run" {  return CmakeTypes.METHOD; }


 "build_name" {  return CmakeTypes.METHOD; }
 "exec_program" {  return CmakeTypes.METHOD; }
 "export_library_dependencies" {  return CmakeTypes.METHOD; }
 "install_files" {  return CmakeTypes.METHOD; }
 "install_programs" {  return CmakeTypes.METHOD; }
 "install_targets" {  return CmakeTypes.METHOD; }
 "load_command" {  return CmakeTypes.METHOD; }
 "make_directory" {  return CmakeTypes.METHOD; }
 "output_required_files" {  return CmakeTypes.METHOD; }
 "remove" {  return CmakeTypes.METHOD; }
 "subdir_depends" {  return CmakeTypes.METHOD; }
 "subdirs" {  return CmakeTypes.METHOD; }
 "use_mangled_mesa" {  return CmakeTypes.METHOD; }
 "utility_source" {  return CmakeTypes.METHOD; }
 "variable_requires" {  return CmakeTypes.METHOD; }
 "write_file" {  return CmakeTypes.METHOD; }




 "VERSION"  {return CmakeTypes.KEY; }
 "GLOB"  {return CmakeTypes.KEY; }
 "SHARED"  {return CmakeTypes.KEY; }
 "STATIC"  {return CmakeTypes.KEY; }
 "IMPORTED"  {return CmakeTypes.KEY; }
 "PROPERTIES"  {return CmakeTypes.KEY; }
 "IMPORTED_LOCATION"  {return CmakeTypes.KEY; }
 "CMAKE_SOURCE_DIR"  {return CmakeTypes.KEY; }
 "ANDROID_ABI"  {return CmakeTypes.KEY; }
 "PROJECT_SOURCE_DIR"  {return CmakeTypes.KEY; }
 "PROJECT_BINARY_DIR"  {return CmakeTypes.KEY; }
 "CMAKE_INCLUDE_PATH"  {return CmakeTypes.KEY; }
 "CMAKE_LIBRARY_PATH"  {return CmakeTypes.KEY; }
 "CMAKE_CURRENT_SOURCE_DIR"  {return CmakeTypes.KEY; }
 "CMAKE_CURRENT_BINARY_DIR"  {return CmakeTypes.KEY; }
 "CMAKE_CURRENT_LIST_FILE"  {return CmakeTypes.KEY; }
 "CMAKE_CURRENT_LIST_LINE"  {return CmakeTypes.KEY; }
 "CMAKE_MODULE_PATH"  {return CmakeTypes.KEY; }
 "EXECUTABLE_OUTPUT_PATH"  {return CmakeTypes.KEY; }
 "LIBRARY_OUTPUT_PATH"  {return CmakeTypes.KEY; }
 "PROJECT_NAME"  {return CmakeTypes.KEY; }
 "CMAKE_ALLOW_LOOSE_LOOP_CONSTRUCTS"  {return CmakeTypes.KEY; }

 //.............


}



({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }