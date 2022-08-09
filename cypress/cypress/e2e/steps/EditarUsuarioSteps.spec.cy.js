
import EditarUsuarioPage from "../pages/EditarUsuarioPage";

const editarUsuarioPage = new EditarUsuarioPage;

context('Editar usuario com Sucesso', () => {

    it('passes', () => {

    editarUsuarioPage.abrirNavegador();
    editarUsuarioPage.preencherNome();
    editarUsuarioPage.preencherUltimoNome();
    editarUsuarioPage.preencherEmail();
    editarUsuarioPage.preencherEndereco();
    editarUsuarioPage.preencherUniversidade();
    editarUsuarioPage.preencherProfissao();
    editarUsuarioPage.preencherGenero();
    editarUsuarioPage.preencherIdade();
    editarUsuarioPage.clicarCriar();

    // Validações:
    
    editarUsuarioPage.validarEdicao();

/*
    editarUsuarioPage.validarNomeEditado();
    novoUsuarioPage.validarUltimoNomeEditado();
    novoUsuarioPage.validarEmailEditado();
    novoUsuarioPage.validarUniversidadeEditado();
*/


})

})