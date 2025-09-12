package lista1;

public class questao4 implements iQuestao {
private int numerador;
private int denominador;
public questao4(int numerador, int denominador) {
	this.numerador = numerador;
	this.denominador = denominador;
}
public int getNumerador() {
	return numerador;
}
public void setNumerador(int numerador) {
	this.numerador = numerador;
}
public int getDenominador() {
	return denominador;
}
public void setDenominador(int denominador) {
	this.denominador = denominador;
}
@Override
public questao4 criar() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public questao4 somar() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public questao4 multiplicar() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public questao4 igualdeTestar() {
	// TODO Auto-generated method stub
	return null;
}


}
