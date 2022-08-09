export default class EditarUsuarioElement {

    url() {return 'https://automacaocombatista.herokuapp.com/users/11276/edit'}

    
    campoNome() {return '#user_name'}

    campoUltimoNome() {return '#user_lastname'}
    
    campoEmail() {return '#user_email'}
    
    campoEndereco() {return '#user_address'}
    
    campoUniversidade() {return '#user_university'}
    
    campoProfissao() {return '#user_profile'}
    
    campoGenero() {return '#user_gender'}
    
    campoIdade() {return '#user_age'}
    
    btnCriar() {return '#edit_user_11276 > div:nth-child(8) > div > div > input[type=submit]'}

    // Validação:

    confirmaEditado() {return '#notice'}


    
    }
    