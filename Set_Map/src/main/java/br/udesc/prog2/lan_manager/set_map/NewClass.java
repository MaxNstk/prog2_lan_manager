/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2.lan_manager.set_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author max
 */
public class NewClass {
    
    public static void main(String[] args) {
        
    
    Set<Aluno> alunos = new HashSet<>();
    alunos.add(new Aluno("Max", 1));
    alunos.add(new Aluno("Luiz", 2));
    alunos.add(new Aluno("João", 3));    
    alunos.add(new Aluno("Caue", 4));    
    alunos.add(new Aluno("Gabriel", 3));    
    System.err.println(alunos);
    
    Map<String, Aluno> alunosMap = new HashMap<>();   
    alunosMap.put("max", new Aluno("luizGay", 123));
    
    Set<String> chaves = alunosMap.keySet();
    System.out.println(chaves);
    
    
    }
    
}
