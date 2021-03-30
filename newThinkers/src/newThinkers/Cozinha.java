package newThinkers;

import java.util.ArrayList;

public class Cozinha {

private int numeroCozinheiros;
private int numerodePratos;
private int tempoPreparo;
private int horaAbertura;
private int horaFechamento;

private String tipo;
private String pratoPrincipal;

public ArrayList <Ingrediente> ingredientes;
private ArrayList <Funcionario> funcionarios = new ArrayList <Funcionario> ();

public int getNumeroCozinheiros() {
	return numeroCozinheiros;
}
public void setNumeroCozinheiros(int numeroCozinheiros) {
	this.numeroCozinheiros = numeroCozinheiros;
}
public int getNumerodePratos() {
	return numerodePratos;
}
public void setNumerodePratos(int numerodePratos) {
	this.numerodePratos = numerodePratos;
}
public int getTempoPreparo() {
	return tempoPreparo;
}
public void setTempoPreparo(int tempoPreparo) {
	this.tempoPreparo = tempoPreparo;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getPratoPrincipal() {
	return pratoPrincipal;
}
public void setPratoPrincipal(String pratoPrincipal) {
	this.pratoPrincipal = pratoPrincipal;
}
public int getHoraAbertura() {
	return horaAbertura;
}
public void setHoraAbertura(int horaAbertura) {
	this.horaAbertura = horaAbertura;
}
public int getHoraFechamento() {
	return horaFechamento;
}
public void setHoraFechamento(int horaFechamento) {
	this.horaFechamento = horaFechamento;
}
public ArrayList <Ingrediente> getIngredientes() {
	return ingredientes;
}
public void setIngredientes(ArrayList <Ingrediente> ingredientes) {
	this.ingredientes = ingredientes;
}
public ArrayList <Funcionario> getFuncionarios() {
	return funcionarios;
}
public void setFuncionarios(ArrayList <Funcionario> funcionarios) {
	this.funcionarios = funcionarios;
}

}
