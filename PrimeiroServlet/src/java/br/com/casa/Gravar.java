/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casa;

/**
 *
 * @author Diéle
 */
import javax.servlet.http.*;
import java.io.*;

public class Gravar extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        
        String nome,endereco, cidade, fone;
        int idade;
        nome = request.getParameter("nome");
        idade = Integer.parseInt(request.getParameter("idade"));
        endereco = request.getParameter("endereco");
        cidade = request.getParameter("cidade");
        fone = request.getParameter("fone");
        
        // adicionado na segunda aula (veio da classe gravar) serve oara gravar dentro do arrayist
        //Dados novo = new Dados();
        //novo.setNome(nome);
        //novo.setIdade(idade);
        //novo.setEndereco(endereco);
        //novo.setCidade(cidade);
        //novo.setFone(fone);
        //Dados.lista01.add(novo);
        //
        
        
        response.setContentType("text/html");
        
        out.println("<h1>Bem vindo "+nome+" "+idade+" "+endereco+" "+cidade+" "+fone+"   <h1>");
        out.close();
        
    }
    
    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
    doGet(request,response);
            
    }
}
