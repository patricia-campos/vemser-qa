
import Utils from "../utils/utils";
const utils = new Utils  


import NovoUsuarioElement from "../elements/NovoUsuarioElement";
const novoUsuarioElement = new NovoUsuarioElement

export default class NovoUsuarioPage {

    abrirNavegador() {
        utils.navegar(novoUsuarioElement.url());
    }

    preencherNome() {
        utils.preencherInput(novoUsuarioElement.campoNome(), 'Aaaaaaaaaaaalice');
    }

    preencherUltimoNome() {
        utils.preencherInput(novoUsuarioElement.campoUltimoNome(), 'AaaaaaaaaaaaCampos')
    }

    preencherEmail() {
        utils.preencherInput(novoUsuarioElement.campoEmail(), 'aaaa@aaa.com' )
    }

    preencherEndereco() {
        utils.preencherInput(novoUsuarioElement.campoEndereco(), 'Rua Inexistente, 110')
    }

    preencherUniversidade() {
        utils.preencherInput(novoUsuarioElement.campoUniversidade(), 'Universidade Fictícia')
    }

    preencherProfissao() {
        utils.preencherInput(novoUsuarioElement.campoProfissao(), 'Cientista de Dados')
    }

    preencherGenero() {
        utils.preencherInput(novoUsuarioElement.campoGenero(), 'Feminino')
    }

    preencherIdade() {
        utils.preencherInput(novoUsuarioElement.campoIdade(), '34')
    }

    clicarCriar() {
        utils.click(novoUsuarioElement.btnCriar())
    }
    
    //Validação:

    validarUsuarioCadastrado() {
        utils.validarText(novoUsuarioElement.confirmaCriado, 'Usuario Criado com sucesso')
    }
    
  
/*
    validarNomeCadastrado() {
        utils.validarText(novoUsuarioElement.confirmaNome, 'Aaaaaaaaaaaalice')
    }

    validarUltimoNomeCadastrado() {
        utils.validarText(novoUsuarioElement.confirmaUltimoNome, 'AaaaaaaaaaaaCampos')
    }

    validarEmailCadastrado() {
        utils.validarText(novoUsuarioElement.confirmaEmail, 'aaaa@aaa.com')
    }

    validarUniversidadeCadastrado() {
        utils.validarText(novoUsuarioElement.confirmaUniversidade, 'Universidade Fictícia')
    }
*/
    

}