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
import modelo.consulta;
import java.sql.*;
import java.sql.PreparedStatement;
public class consultaDAO { 
    private Connection connection;    
    String convenio;    
    String  id_medico;
    String  id_paciente;
    
    public consultaDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(consulta cons){ 
        String sql = "INSERT INTO consulta(id_medico,id_paciente,convenio) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cons.getConvenio());            
            stmt.setString(2, cons.getIdMedico());
            stmt.setString(3, cons.getIdPaciente());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        }         
    }    
    
    
}
