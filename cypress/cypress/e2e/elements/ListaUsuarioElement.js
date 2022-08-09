export default class ListaUsuarioElement {

    url() {return 'https://automacaocombatista.herokuapp.com/users'}

    
    btnNovoUsuario() {return 'body > div.container > div:nth-child(3) > div > a.btn.waves-light.green'}

    btnVoltar() {return 'body > div.container > div:nth-child(3) > div > a.btn.red'}

    btnEditar() {return 'body > div.row > div > table > tbody > tr:nth-child(7) > td:nth-child(10) > a'}

    btnDeletar() {return 'body > div.row > div > table > tbody > tr:nth-child(2) > td:nth-child(11) > a'}
    
    }
    
    // ========================================================================================
    // Aqui são feitas as declarações dos elementos, é aqui que fazemos o mapeamento dos campos.