/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.merlab.merlynx;


//import com.merlab.merlynx.lexer.MerlynxLexer;
//import com.merlab.merlynx.parser.MerlynxParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.IOException;

/**
 *
 * @author merly
 */
public class MerlynxCore {

    public static void main(String[] args) throws IOException {
        // Ejemplo de código Merlynx
        System.out.println("Hello World! Now Merlynx is officially born in English!!");
        /*
        String code = "pipeline simple_pipeline {\n" +
                      "    input: signal1;\n" +
                      "    process: filter(signal1);\n" +
                      "    output: filtered_signal;\n" +
                      "}";

        // Crear un CharStream desde el código
        CharStream input = CharStreams.fromString(code);

        // Crear el lexer y parser
        MerlynxLexer lexer = new MerlynxLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MerlynxParser parser = new MerlynxParser(tokens);

        // Parsear desde la regla principal (program)
        ParseTree tree = parser.program();

        // Imprimir el árbol sintáctico en consola
        System.out.println(tree.toStringTree(parser));

        */
    }
}
