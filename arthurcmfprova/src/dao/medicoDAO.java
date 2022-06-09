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
import modelo.medico;
import java.sql.*;
import java.sql.PreparedStatement;
public class medicoDAO { 
    private Connection connection;  
    Long id_medico;
    String nome;
    String cpf;
    String crm;
    String  especialidade;
    
    public medicoDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(medico med){ 
        String sql = "INSERT INTO medico(nome,cpf,crm,especialidade) VALUES(?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, med.getNome());
            stmt.setString(2, med.getCpf());
            stmt.setString(3, med.getCrm());
            stmt.setString(4, med.getEspecialidade());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }         
    }     
}
