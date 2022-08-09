
import ListaUsuarioPage from "../pages/ListaUsuarioPage";

const listaUsuarioPage = new ListaUsuarioPage;

//---------------------------------------------------------------------

context('Acessar editar usuario com Sucesso', () => {

    it('editar usuário', () => {
    
    listaUsuarioPage.abrirNavegador();

    listaUsuarioPage.clicarEditar();

})

/*
    //INATIVO

    it('deletar usuário', () => {
    
    listaUsuarioPage.abrirNavegador();

    listaUsuarioPage.clicarDeletar();


})
*/

})