/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Arthur
 */

import factory.ConnectionFactory;
import modelo.paciente;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class pacienteDAO { 
    private Connection connection;    
    String nome;
    String cpf;
    String  idade;
    
    public pacienteDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(paciente pac){ 
        String sql = "INSERT INTO paciente(nome,cpf,idade) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pac.getNome());
            stmt.setString(2, pac.getCpf());
            stmt.setString(3, pac.getIdade());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }         
    }     
    
    //public List<paciente> listarPacientes(){    
    
    /*public ArrayList listarPaciente(){
        try {            
            //List<paciente> lista = ArrayList<>(); 
            ArrayList lista = new ArrayList();
            String sql = "select nome from paciente";
           
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                paciente pac = new paciente();                
                pac.setNome(rs.getString("nome"));
                
                lista.add(pac);
            }
            
            return lista;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        } 
    }*/
     
}

