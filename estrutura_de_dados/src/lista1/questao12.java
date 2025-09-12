package lista1;

public class questao12 {
private double data;
private double valorTotal;
private int itensComprados;
public questao12(double data, double valorTotal, int itensComprados) {
	
	this.data = data;
	this.valorTotal = valorTotal;
	this.itensComprados = itensComprados;
}
public double getData() {
	return data;
}
public void setData(double data) {
	this.data = data;
}
public double getValorTotal() {
	return valorTotal;
}
public void setValorTotal(double valorTotal) {
	this.valorTotal = valorTotal;
}
public int getItensComprados() {
	return itensComprados;
}
public void setItensComprados(int itensComprados) {
	this.itensComprados = itensComprados;
}

}
