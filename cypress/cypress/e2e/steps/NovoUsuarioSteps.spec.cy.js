
import NovoUsuarioPage from "../pages/NovoUsuarioPage";

const novoUsuarioPage = new NovoUsuarioPage;

context('Cadastrar usuario com Sucesso', () => {

    it('passes', () => {

    novoUsuarioPage.abrirNavegador();
    novoUsuarioPage.preencherNome();
    novoUsuarioPage.preencherUltimoNome();
    novoUsuarioPage.preencherEmail();
    novoUsuarioPage.preencherEndereco();
    novoUsuarioPage.preencherUniversidade();
    novoUsuarioPage.preencherProfissao();
    novoUsuarioPage.preencherGenero();
    novoUsuarioPage.preencherIdade();
    novoUsuarioPage.clicarCriar();

    // Validações:

    novoUsuarioPage.validarUsuarioCadastrado();

/*
    novoUsuarioPage.validarNomeCadastrado();
    novoUsuarioPage.validarUltimoNomeCadastrado();
    novoUsuarioPage.validarEmailCadastrado();
    novoUsuarioPage.validarUniversidadeCadastrado();
*/

})

})