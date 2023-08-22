package adailton;

//import javafx.css.Match;

//import java.math.*;
public class OrganizaCalculos {
	
	String expressaoOrganizada[] = {"", "", ""};
	String total = "";
	/* Método que verifica a presença de algum '.' na String */
	@SuppressWarnings("unlikely-arg-type")
	public boolean desabilitaPonto(String valor) {
		boolean temPonto = false;
		//int posicaoPonto = 0;
		
		/* Verifica a presença de ponto em cada posição da String valor */
		for(int i = 0; i < valor.length(); i++) {
			/* Se não houver '.' na String valor, o retorno é falso */
			if(!".".equals(valor.charAt(i))) {
				temPonto = false;
			}else {
				temPonto = true;
			}
		}
		return temPonto;
	}
	
	String organizaOperando(String valor) {
		String operando = "";
		String operandoInt = "";
		String operandoDec = "";
		Character sinal[] = {'+', '-', '*', '/', '%', '^', '=', null};
		int posicaoSinal = 0;
		int contaPonto = 0;
		int posicaoPonto = 0;
	
		for(int i = 0; i < valor.length(); i++) {
			// Se houver '.' em valor, o contador de PONTO incrementa 1 e grava a posição dele na string
			if(".".equals(valor.charAt(i))) {
				contaPonto++;
				posicaoPonto = i;
			}else { // Caso não haja ponto, sua posição vai para o final da string
				posicaoPonto = (valor.length());
			}
		}
		
		for(int j = 0; j < valor.length(); j++) {
			/* 
			 * Se houver mais de um '.' e a posição for diferente
			 * irá remover esse '.' em excesso,
			 * Separará a parte inteira da parte decimal
			 * a partir da posição do '.' 
			 */
			if(contaPonto > 1 && (!".".equals(valor.charAt(posicaoPonto)))) {
				valor.replace( valor.charAt(j), '\0');
				operandoInt += valor.charAt(j - 1);
				operandoDec += valor.charAt(j + 1);
				operando = operandoInt + operandoDec;
			}else {
				operando += valor.charAt(j);
			}
		}
		
		// Verifica se há algum sinal de operador aritmético
		for(int k = 0; k < valor.length(); k++) {
			for(int l = 0; l < 7; l++) {
				/* 
				 * Caso haja algum operador presente, será armazenada a sua posição
				 * caso contrário, sua posição será zero 
				 */
				if(Character.toString(sinal[l]).equals(valor.charAt(k))) {
					posicaoSinal = k;
					expressaoOrganizada[1] += valor.charAt(posicaoSinal);
					for(int x = posicaoSinal + 1; x < valor.length(); x++) {
						expressaoOrganizada[2] += valor.charAt(x);
					}
				}else {
					posicaoSinal = 0;
					expressaoOrganizada[0] += operando;
				}
			}
		}
		
		if(posicaoSinal > 0) {
			for(int m = posicaoSinal + 1; m < valor.length(); m++) {
			//	opAtual += valor.charAt(m);
			}
			// operando = opAtual;
		}
	
		return operando;
	}
	
	/* Método para limpeza de string */
	String limpaString(String valor) {
		String textoLimpo = "";
		
		for(int i = 0; i < valor.length(); i++) {
			textoLimpo += "\0";
		}
		
		return textoLimpo;
	}
	
	/* Método para multiplicar */
	String multiplicar() {
		double operandoA = Double.parseDouble(expressaoOrganizada[0]);
		double operandoB = Double.parseDouble(expressaoOrganizada[2]);
		
		limpaString(expressaoOrganizada[0]);
		limpaString(expressaoOrganizada[1]);
		limpaString(expressaoOrganizada[2]);
		
		double total = operandoA * operandoB;
		
		return Double.toString(total);
	}
	
	/* Método para dividir */
	String dividir() {
		double operandoA = Double.parseDouble(expressaoOrganizada[0]);
		double operandoB = Double.parseDouble(expressaoOrganizada[2]);
		
		limpaString(expressaoOrganizada[0]);
		limpaString(expressaoOrganizada[1]);
		limpaString(expressaoOrganizada[2]);
		
		if(operandoB == 0) {
			return "Impossível dividir por ZERO";
		}else {
			double total = operandoA / operandoB;
			return Double.toString(total);
		}
	}
	
	/* Método para somar */
	String somar() {
		double operandoA = Double.parseDouble(expressaoOrganizada[0]);
		double operandoB = Double.parseDouble(expressaoOrganizada[2]);
		
		limpaString(expressaoOrganizada[0]);
		limpaString(expressaoOrganizada[1]);
		limpaString(expressaoOrganizada[2]);
		
		double total = operandoA + operandoB;
		return Double.toString(total);
	}
	
	/* Método para subtrair */
	String subtrair() {
		double operandoA = Double.parseDouble(expressaoOrganizada[0]);
		double operandoB = Double.parseDouble(expressaoOrganizada[2]);
		
		limpaString(expressaoOrganizada[0]);
		limpaString(expressaoOrganizada[1]);
		limpaString(expressaoOrganizada[2]);
		
		double total = operandoA - operandoB;
		return Double.toString(total);
	}
	
	/* Método para porcentagem */
	String porcentagem() {
		double operandoA = Double.parseDouble(expressaoOrganizada[0]);
		double operandoB = Double.parseDouble(expressaoOrganizada[2]);
		
		limpaString(expressaoOrganizada[0]);
		limpaString(expressaoOrganizada[1]);
		limpaString(expressaoOrganizada[2]);
		
		operandoA = operandoA / 100;
		
		double total = operandoA * operandoB;
		return Double.toString(total);
	}
	
	/* Método para exponenciação */
	String exponenciacao() {
		double operandoA = Double.parseDouble(expressaoOrganizada[0]);
		double operandoB = Double.parseDouble(expressaoOrganizada[2]);
		
		limpaString(expressaoOrganizada[0]);
		limpaString(expressaoOrganizada[1]);
		limpaString(expressaoOrganizada[2]);
		
		double total = Math.pow(operandoA,operandoB);
		
		return Double.toString(total);
	}
	
	/* Método para clamar os cálculos */
	String chamaCalculo() {
		// a desenvolver
		String resultadoCalculo = "";
		
		if(!expressaoOrganizada[0].equals("") && !expressaoOrganizada[1].equals("") && !expressaoOrganizada[2].equals("")){
			
			switch(expressaoOrganizada[1]) {
			case "+" :
				resultadoCalculo = somar();
				break;
			case "-" :
				resultadoCalculo = subtrair();
				break;
			case "*" :
				resultadoCalculo = multiplicar();
				break;
			case "/" :
				resultadoCalculo = dividir();
			case "%" :
				resultadoCalculo = porcentagem();
			case "^" :
				resultadoCalculo = exponenciacao();
				break;
			default:
				resultadoCalculo = "erro...";
			}
		}else {
			resultadoCalculo = "Nada gravado aqui";
		}
		
		return resultadoCalculo;
	}
}
