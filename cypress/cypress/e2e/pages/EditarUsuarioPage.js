
import Utils from "../utils/utils";
const utils = new Utils  


import EditarUsuarioElement from "../elements/EditarUsuarioElement";
const editarUsuarioElement = new EditarUsuarioElement

export default class EditarUsuarioPage {

    abrirNavegador() {
        utils.navegar(editarUsuarioElement.url());
    }

    preencherNome() {
        utils.preencherInput(editarUsuarioElement.campoNome(), 'Aaaaaaaaaaaaliceee');
    }

    preencherUltimoNome() {
        utils.preencherInput(editarUsuarioElement.campoUltimoNome(), 'Camposss')
    }

    preencherEmail() {
        utils.preencherInput(editarUsuarioElement.campoEmail(), 'aaaa@aaa.com' )
    }

    preencherEndereco() {
        utils.preencherInput(editarUsuarioElement.campoEndereco(), 'Rua Inexistente, 110')
    }

    preencherUniversidade() {
        utils.preencherInput(editarUsuarioElement.campoUniversidade(), 'Universidade Fictícia')
    }

    preencherProfissao() {
        utils.preencherInput(editarUsuarioElement.campoProfissao(), 'Cientista de Dados')
    }

    preencherGenero() {
        utils.preencherInput(editarUsuarioElement.campoGenero(), 'Feminino')
    }

    preencherIdade() {
        utils.preencherInput(editarUsuarioElement.campoIdade(), '34')
    }

    clicarCriar() {
        utils.click(editarUsuarioElement.btnCriar())
    }

    // Validação:

    validarUsuarioEditado() {
        utils.validarText(editarUsuarioElement.confirmaEditado, 'Seu Usuário foi Atualizado!')
    }

}