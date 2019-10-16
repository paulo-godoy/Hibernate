package br.com.paulo.financas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//dica para o hibernate persistir os dados no banco com @entity
	@Entity
public class Conta {
	
	
		
//		informando o hibernate que o id é uma chave primaria com @id
		@Id
//		com o @GeneratedValue o hibernate gerencia os valores com autoincrement
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		private String titular;
		private String numero;
		private String banco;
		private String agencia;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getBanco() {
			return banco;
		}
		public void setBanco(String banco) {
			this.banco = banco;
		}
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		

}
