package com.mycompany.verificador;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCpf(){
        return cpf;
    }

    public  boolean validarNome(String nome){
        return nome.length() >= 3;
    }
    public  boolean validarIdade(int idade) {
        return idade >= 12 && idade < 120;
    }
    public  boolean validarCPF(String cpf) {

       
        

        if (cpf.length() != 11){
            return false;
        }

        var A = cpf.substring(0,1);
        var a = Integer.parseInt(A);

        var B = cpf.substring(1,2);
        var b = Integer.parseInt(B);

        var C = cpf.substring(2,3);
        var c = Integer.parseInt(C);

        var D = cpf.substring(3,4);
        var d = Integer.parseInt(D);

        var E = cpf.substring(4,5);
        var e = Integer.parseInt(E);

        var F = cpf.substring(5,6);
        var f = Integer.parseInt(F);

        var G = cpf.substring(6,7);
        var g = Integer.parseInt(G);

        var H = cpf.substring(7,8);
        var h = Integer.parseInt(H);

        var I = cpf.substring(8,9);
        var i = Integer.parseInt(I);
        // ----------------------------

        // DIGITOS VERIFICADORES!!!
        var J = cpf.substring(9,10);
        var j = Integer.parseInt(J);

        var K = cpf.substring(10,11);
        var k = Integer.parseInt(K);

        var Jresto = (((10*a) + (9*b) + (8*c) + (7*d) + (6*e) + (5*f) + (4*g) + (3*h) + (2*i)) % 11);
        var Kresto = (((11*a) + (10*b) + (9*c) + (8*d) + (7*e) + (6*f) + (5*g) + (4*h) + (3*i) + (2*j)) % 11);

        if (Jresto < 2){
            Jresto = 0;
        } else{
            Jresto = 11 - Jresto;
        }
        if (Kresto < 2){
            Kresto = 0;
        } else{
            Kresto = 11 - Kresto;
        }

        return (Jresto == j && Kresto == k);

    }

  




}
