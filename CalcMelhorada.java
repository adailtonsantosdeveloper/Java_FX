package adailton;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
//import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class CalcMelhorada extends Application {
		
	String strExpressoes  = "";
	String opAnterior = "";
	String opAtual = "";
	String operador = "";
	String operacao = "";
	
	public void start(Stage primaryStage) throws Exception {
		//strExpressoes = "";
		TextArea areaTexto = new TextArea();
		OrganizaCalculos calc = new OrganizaCalculos();
		
		VBox boxPrincipal = new VBox();
		HBox boxHorizontal_1 = new HBox();
		HBox boxHorizontal_2 = new HBox();
		HBox boxHorizontal_3 = new HBox();
		HBox boxHorizontal_4 = new HBox();
		HBox boxHorizontal_5 = new HBox();
		
		/* Botões de operadores */
		Button btnMult = new Button("*");
		Button btnDiv = new Button("/");
		Button btnPorcent = new Button("%");
		Button btnExp = new Button("^");
		Button btnClear = new Button("Limpar");
		Button btnSoma = new Button("+");
		Button btnSubt = new Button("-");
		
		/* Iniciando com operadores desabilitados */
		btnMult.setDisable(true);
		btnDiv.setDisable(true);
		btnPorcent.setDisable(true);
		btnExp.setDisable(true);
		btnClear.setDisable(true);
		btnSoma.setDisable(true);
		btnSubt.setDisable(true);
		
		/* Botões de dígitos numéricos e ponto flutuante */
		Button btn0 = new Button("0");
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");
		Button btn6 = new Button("6");
		Button btn7 = new Button("7");
		Button btn8 = new Button("8");
		Button btn9 = new Button("9");
		Button btnPonto = new Button(".");
		/* Ponto flutuante inicia desabilitato */
		btnPonto.setDisable(true);
		Button btnIgual = new Button("=");
		/* Botão '=' inicia desabilitado */
		btnIgual.setDisable(true);
		
		
		/* Acionamento dos botões numéricos */
		btn0.setOnAction(e -> {
			strExpressoes += "0";
			areaTexto.setText(strExpressoes);// += "0";
			
			/* Habilitanto operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				if(opAnterior.contains(".") && opAtual.equals(""))
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn1.setOnAction(e -> {
			strExpressoes += "1";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn2.setOnAction(e -> {
			strExpressoes += "2";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn3.setOnAction(e -> {
			strExpressoes += "3";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn4.setOnAction(e -> {
			strExpressoes += "4";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn5.setOnAction(e -> {
			strExpressoes += "5";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn6.setOnAction(e -> {
			strExpressoes += "6";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn7.setOnAction(e -> {
			strExpressoes += "7";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn8.setOnAction(e -> {
			strExpressoes += "8";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnSubt.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		//	btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		});
		
		btn9.setOnAction(e -> {
			strExpressoes += "9";
			areaTexto.setText(strExpressoes);
			
			/* Habilitando operadores */
			btnMult.setDisable(false);
			btnDiv.setDisable(false);
			btnPorcent.setDisable(false);
			btnExp.setDisable(false);
			btnClear.setDisable(false);
			btnSoma.setDisable(false);
			btnIgual.setDisable(false);
			if(strExpressoes.contains(".")) { // Se já houver '.' desabilitar o botão de ponto
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		});
		//btnPonto.setDisable(!calc.desabilitaPonto(strExpressoes)); /* verificar */
		
		
		
		btnPonto.setOnAction(e -> {
			if(calc.desabilitaPonto(strExpressoes) == false) {
				strExpressoes += ".";
				btnPonto.setDisable(true);
				areaTexto.setText(strExpressoes + "");
			}else {
				strExpressoes += "";
				areaTexto.setText(strExpressoes);
			}
		});
		
		// está dando arro a partir da implementação do ponto flutuante
		
		//btnPonto.setDisable(calc.desabilitaPonto(strExpressoes));
		/* 
		btnPonto.setOnAction(e -> {
			
			areaTexto.setText(strExpressoes);
		});
		*/
		
		/* Programando os botões de operação */
		
		btnMult.setOnAction(e -> {
			
			btnMult.setDisable(true);
			btnDiv.setDisable(true);
			btnPorcent.setDisable(true);
			btnExp.setDisable(true);
			btnClear.setDisable(false);
			btnSoma.setDisable(true);
			btnSubt.setDisable(true);
			
			if("".equals(opAnterior)) {
				opAnterior = strExpressoes;
				strExpressoes = calc.limpaString(strExpressoes);
				operacao = "*";
				areaTexto.setText(opAnterior + "*");
			}else if(!opAnterior.equals("") && opAtual.equals("")) {
				opAtual = strExpressoes;
				strExpressoes = calc.limpaString(strExpressoes);
			}else {
				//strExpressoes = opAnterior + operacao + opAtual;
				calc.expressaoOrganizada[0] = opAnterior;
				calc.expressaoOrganizada[1] = operacao;
				calc.expressaoOrganizada[2] = opAtual;
				strExpressoes += calc.chamaCalculo();
				areaTexto.setCursor(null);
				areaTexto.setText(strExpressoes);
				opAnterior = calc.limpaString(opAnterior);
				opAtual = calc.limpaString(opAtual);
			}
			
				
		});
		
		btnDiv.setOnAction(e -> {
			areaTexto.setText(strExpressoes);
			
			/* Desabilitando os operadores apóes o acionamento */
			btnMult.setDisable(true);
			btnDiv.setDisable(true);
			btnPorcent.setDisable(true);
			btnExp.setDisable(true);
			btnClear.setDisable(false);
			btnSoma.setDisable(true);
			if(strExpressoes.contains(".")) {
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		});
		
		btnPorcent.setOnAction(e -> {
			areaTexto.setText(strExpressoes);
			
			/* Desabilitando os operadores apóes o acionamento */
			btnMult.setDisable(true);
			btnDiv.setDisable(true);
			btnPorcent.setDisable(true);
			btnExp.setDisable(true);
			btnClear.setDisable(true);
			btnSoma.setDisable(true);
			if(strExpressoes.contains(".")) {
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		});
		
		btnExp.setOnAction(e -> {
			areaTexto.setText(strExpressoes);
			
			/* Desabilitando os operadores apóes o acionamento */
			btnMult.setDisable(true);
			btnDiv.setDisable(true);
			btnPorcent.setDisable(true);
			btnExp.setDisable(true);
			btnClear.setDisable(true);
			btnSoma.setDisable(true);
			if(strExpressoes.contains(".")) {
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		});
		
		btnSoma.setOnAction(e -> {
			areaTexto.setText(strExpressoes);
			
			/* Desabilitando os operadores apóes o acionamento */
			btnMult.setDisable(true);
			btnDiv.setDisable(true);
			btnPorcent.setDisable(true);
			btnExp.setDisable(true);
			btnClear.setDisable(true);
			btnSoma.setDisable(true);
			btnSubt.setDisable(true);
			if(strExpressoes.contains(".")) {
				btnPonto.setDisable(true);
			}else {
				btnPonto.setDisable(false);
			}
		});
		
		btnClear.setOnAction(e -> {
		
			strExpressoes = calc.limpaString(strExpressoes);
			
			areaTexto.setText(strExpressoes);
		});
		
		btnIgual.setOnAction(e -> {
			
			if(opAnterior.equals("") && operacao.equals("") && opAtual.equals("")) {
				//calc.expressaoOrganizada[0]
			}
			
			calc.organizaOperando(strExpressoes);
			calc.chamaCalculo();
		});
		
		
		/* Adicionando os ítens aos box horizontais */

		boxHorizontal_1.getChildren().add(btnClear);
		boxHorizontal_1.getChildren().add(btnPorcent);
		boxHorizontal_1.getChildren().add(btnExp);
		boxHorizontal_1.getChildren().add(btnMult);
		
		boxHorizontal_2.getChildren().add(btn7);
		boxHorizontal_2.getChildren().add(btn8);
		boxHorizontal_2.getChildren().add(btn9);
		boxHorizontal_2.getChildren().add(btnDiv);
		
		boxHorizontal_3.getChildren().add(btn4);
		boxHorizontal_3.getChildren().add(btn5);
		boxHorizontal_3.getChildren().add(btn6);
		boxHorizontal_3.getChildren().add(btnSoma);
		
		boxHorizontal_4.getChildren().add(btn1);
		boxHorizontal_4.getChildren().add(btn2);
		boxHorizontal_4.getChildren().add(btn3);
		boxHorizontal_4.getChildren().add(btnSubt);
		
		boxHorizontal_5.getChildren().add(btn0);
		boxHorizontal_5.getChildren().add(btnPonto);
		boxHorizontal_5.getChildren().add(btnIgual); // Precisa ocupar duas colunas
		
		/* Adicionando os ítens ao box vertical */
		
		boxPrincipal.getChildren().add(areaTexto);
		areaTexto.setText(strExpressoes);
		boxPrincipal.getChildren().add(boxHorizontal_1);
		boxPrincipal.getChildren().add(boxHorizontal_2);
		boxPrincipal.getChildren().add(boxHorizontal_3);
		boxPrincipal.getChildren().add(boxHorizontal_4);
		boxPrincipal.getChildren().add(boxHorizontal_5);
		
		Scene cenaPrincipal = new Scene(boxPrincipal, 300, 300);
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
	}
	
	public static void main(String []args) {
		launch(args);
	}
	
}
