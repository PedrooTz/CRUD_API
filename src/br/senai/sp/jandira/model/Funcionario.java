package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {

    private String nome, cargo, departamento;

    private int idFuncionario = 0;
    private double salario;

    public String getNome() {
        return nome;
    }
    Scanner scanner = new Scanner(System.in);
    public void cadastrarFuncionario(){
        System.out.println("Informe o nome");
        this.nome = scanner.nextLine();
        System.out.println("Informe o cargo");
        this.cargo = scanner.nextLine();
        System.out.println("Informe o departamento");
        this.departamento = scanner.nextLine();
        System.out.println("Informe o salário");
        this.salario = scanner.nextDouble();
        scanner.nextLine();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
