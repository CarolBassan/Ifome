package com.example.ifome;
/*Banco

CREATE TABLE `usuario` (
	`id` INT(10) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(100) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_0900_ai_ci',
	`senha` VARCHAR(50) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_0900_ai_ci',
	`endereco` VARCHAR(100) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_0900_ai_ci',
	`cidade` VARCHAR(100) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_0900_ai_ci',
	`fone` VARCHAR(20) NOT NULL DEFAULT '0' COLLATE 'utf8mb4_0900_ai_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_0900_ai_ci'
ENGINE=InnoDB
;

 */
public class usuario {

    private int id;
    private String nome;
    private String senha;
    private String endereco;
    private String cidade;
    private String fone;

    public usuario() {
    }

    public usuario(int id, String nome, String senha, String endereco,  String fone,String cidade) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
        this.fone = fone;
        this.cidade = cidade;
    }
    public usuario( String nome, String senha, String endereco, String fone,String cidade) {
        this.nome = nome;
        this.senha = senha;
        this.endereco = endereco;
        this.fone = fone;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidadefone) {
        this.cidade = cidadefone;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
