package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate date;
	
	public Mentoria() {
		
	}
	
	public Mentoria(String titulo, String descricao, LocalDate date) {
		super(titulo, descricao);
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", date=" + date + "]";
	}


	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	

}
