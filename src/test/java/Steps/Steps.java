package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos m = new Metodos ();
	Elementos e = new Elementos ();
	
	
	
	@When("selecionar a aba Verity")
	public void selecionar_a_aba_verity() {
	m.clicar(e.getBtnVerity());
	    
	}

	@Then("sera exibido a mensagem Nossas soluções_")
	public void sera_exibido_a_mensagem_nossas_soluções() throws InterruptedException {
	m.validarTitulo(e.getTextoNossasSolucoes(), "Nossas soluções_");
	m.pausa(3000);
	m.fecharNavegador();
	}
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
	m.abrirNavegador(url);
	
	}

	

	@Given("selecionar a aba Contato")
	public void selecionar_a_aba_contato() {
	m.clicar(e.getBtnContato());
	   
	}

	@When("preencher o formulario Vamos conversar")
	public void preencher_o_formulario_vamos_conversar() {
		m.preencher(e.getCampoNome(), "Tamiris de Jesus da Silva");
		m.preencher(e.getCampoEmail(), "tamirisdasilvajesus@gmail.com");
		m.preencher(e.getCampoTelefone(), "75983684889");
	    m.preencher(e.getCampoDesafio(), "Garantir a qualidade do software e a satisfação do usuário final!");
	}
	
	@When("selecionar o checkbox Aceito receber mensagens da Verity")
	public void selecionar_o_checkbox_aceito_receber_mensagens_da_verity() {
	m.clicar(e.getCheckboxAceito());
	    
	}
	
	@When("clicar no botao enviar")
	public void clicar_no_botao_enviar() {
	m.clicar(e.getBtnEnviar());
	m.fecharNavegador();  
	}

	@Then("sera exibido a mensagem Obrigado!")
	public void sera_exibido_a_mensagem_obrigado() {
	    
	}

}
