/******************************************************************************

Um orfanato deseja cadastrar os doadores voluntários. Para isso deve ter as seguintes informações: 
código, nome, endereço, cidade e valor doado. Sabendo que são 50 doadores, depois de cadastrados,
apresente o código e o nome dos doadores que doaram uma quantia acima de 200 reais.

*******************************************************************************/

public class Orfanato {

      
  private int codigo;
private String nome;
private String endereco;
private String cidade;
private float vdoado;
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
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
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public float getVdoado() {
	return vdoado;
}
public void setVdoado(float vdoado) {
	this.vdoado = vdoado;
}
  
  
}