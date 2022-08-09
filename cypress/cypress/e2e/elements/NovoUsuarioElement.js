export default class NovoUsuarioElement {

url() {return 'https://automacaocombatista.herokuapp.com/users/new'}

campoNome() {return '#user_name'}

campoUltimoNome() {return '#user_lastname'}

campoEmail() {return '#user_email'}

campoEndereco() {return '#user_address'}

campoUniversidade() {return '#user_university'}

campoProfissao() {return '#user_profile'}

campoGenero() {return '#user_gender'}

campoIdade() {return '#user_age'}

btnCriar() {return '#new_user > div:nth-child(7) > div > div > input[type=submit]'}

// Validações:

confirmaCriado() {return '#notice'}


/*
confirmaNome() {return 'body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(1)'}

confirmaUltimoNome() {return 'body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(2)'}

confirmaEmail() {return 'body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(3)'}

confirmaUniversidade() {return 'body > div.row > div.col.s9 > div:nth-child(3) > div > p:nth-child(4)'}
*/

}


// ========================================================================================
// Aqui são feitas as declarações dos elementos, é aqui que fazemos o mapeamento dos campos