package br.com.exemplo.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

  private String nome;
  private String matricula;
  private List<Curso> cursos;

  public Aluno(String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
    this.cursos = new ArrayList<>();
  }

  public void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
  }

  public void imprimir() {
    System.out.println("Aluno: " + this.nome + ", matrícula: " + this.matricula);
    for (Curso curso : this.cursos) {
      curso.imprimir();
    }
  }

}

package br.com.exemplo.escola;

import java.util.ArrayList;
import java.util.List;

public class Curso {

  private String nome;
  private List<Professor> professores;
  private List<Aluno> alunos;

  public Curso(String nome) {
    this.nome = nome;
    this.professores = new ArrayList<>();
    this.alunos = new ArrayList<>();
  }

  public void adicionarProfessor(Professor professor) {
    this.professores.add(professor);
  }

  public void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public void imprimir() {
    System.out.println("Curso: " + this.nome);
    for (Professor professor : this.professores) {
      professor.imprimir();
    }
    for (Aluno aluno : this.alunos) {
      aluno.imprimir();
    }
  }

}

package br.com.exemplo.escola;

import java.util.ArrayList;
import java.util.List;

public class Professor {

  private String nome;
  private List<Disciplina> disciplinas;

  public Professor(String nome) {
    this.nome = nome;
    this.disciplinas = new ArrayList<>();
  }

  public void adicionarDisciplina(Disciplina disciplina) {
    this.disciplinas.add(disciplina);
  }

  public void imprimir() {
    System.out.println("Professor: " + this.nome);
    for (Disciplina disciplina : this.disciplinas) {
      disciplina.imprimir();
    }
  }

}

package br.com.exemplo.escola;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

  private String nome;
  private List<Aluno> alunos;
  private List<Curso> cursos;
  private Professor professor;

  public Disciplina(String nome) {
    this.nome = nome;
    this.alunos = new ArrayList<>();
    this.cursos = new ArrayList<>();
  }

  public void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }

  public void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public void imprimir() {
    System.out.println("Disciplina: " + this.nome);
    for (Aluno aluno : this.alunos) {
      aluno.imprimir();
    }
    for (Curso curso : this.cursos) {
      curso.imprimir();
    }
    System.out.println("Professor: " + this.professor.nome);
  }

}

package br.com.exemplo.escola;

public class Principal {

  public static void main(String[] args) {

// Criando objetos das classes Aluno, Curso e Professor
Aluno aluno1 = new Aluno("João", "123456");
Aluno aluno2 = new Aluno("Maria", "789012");

Curso curso1 = new Curso("Ciência da Computação");
Curso curso2 = new Curso("Engenharia de Software");

Professor professor1 = new Professor("José");}}