/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.merlab.merlynx;

/**
 *
 * @author merly
 */
import com.merlab.merlynx.generated.SimpleLangLexer;
import com.merlab.merlynx.generated.SimpleLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class SimpleParser {
    public static void main(String[] args) throws Exception {
        String input = "print 123;";

        // Crear CharStream desde el string de entrada
        CharStream charStream = CharStreams.fromString(input);

        // Crear lexer y tokens
        SimpleLangLexer lexer = new SimpleLangLexer(charStream); // Cambia por el nombre real de tu lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear parser
        SimpleLangParser parser = new SimpleLangParser(tokens);

        // Parsear la regla inicial (ejemplo: program)
        ParseTree tree = parser.program();

        // Imprimir árbol de parseo
        System.out.println(tree.toStringTree(parser));
    }
}
