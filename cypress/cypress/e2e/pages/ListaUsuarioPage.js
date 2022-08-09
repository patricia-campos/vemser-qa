
import Utils from "../utils/utils";
const utils = new Utils  


import ListaUsuarioElement from "../elements/ListaUsuarioElement";
const listaUsuarioElement = new ListaUsuarioElement

export default class ListaUsuarioPage {

    abrirNavegador() {
        utils.navegar(listaUsuarioElement.url());
    }

    clicarNovoUsuario() {
        utils.click(listaUsuarioElement.btnNovoUsuario());
    }

    clicarVoltar() {
        utils.click(listaUsuarioElement.btnVoltar());
    }

    clicarEditar() {
        utils.clickForce(listaUsuarioElement.btnEditar());
    }

    clicarDeletar() {
        utils.click(listaUsuarioElement.btnDeletar());
    }

}

